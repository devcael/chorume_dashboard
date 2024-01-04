package com.chorume_dashboard.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

// TODO: Add  column asnwer JSON
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "talks")
public class Talks {
  @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  @Column(name = "triggertext", columnDefinition = "varchar(255) not null")
  String triggertext;
  @Column(name = "type", columnDefinition = "varchar(100) not null")
  String type;
  @Column(name = "status", columnDefinition = "tinyint not null")
  Boolean status;

  @Column(name = "created_at", columnDefinition = "datetime not null default current_timestamp")
  LocalDateTime created_at;
  @Column(name = "updated_at", columnDefinition = "datetime not null default current_timestamp")
  LocalDateTime updated_at;

  @PrePersist
  public void prePersist() {
    created_at = LocalDateTime.now();
    updated_at = LocalDateTime.now();
  }

  @PreUpdate
  public void preUpdate() {
    updated_at = LocalDateTime.now();
    }
}
