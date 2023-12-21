package com.chorume_dashboard.models;


import jakarta.persistence.*;

import lombok.*;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 * Users
 */
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Users {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  Integer id;
  @Column(name = "discord_user_id", columnDefinition = "varchar(255)")
  String discord_user_id;
  @Column(name = "discord_username", columnDefinition = "varchar(255)")
  String discord_username;
  @Column(name = "received_initial_coins", columnDefinition = "tinyint(1) default 1")
  Integer received_initial_coins;
  @Column(name = "created_at", updatable = false, columnDefinition = "timestamp default current_timestamp")
  LocalDateTime created_at;
  @Column(name = "updated_at", columnDefinition = "timestamp default current_timestamp on update current_timestamp")
  LocalDateTime updated_at;

  @PrePersist
  public void prePersist() {
    LocalDateTime now = LocalDateTime.now();
    this.created_at = now;
    this.updated_at = now;
  }

  @PreUpdate
  public void preUpdate() {
    this.updated_at = LocalDateTime.now();
  }

}
