package com.chorume_dashboard.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "roulette")
public class Roulette {
  @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  @Column(name = "choice", columnDefinition = "int")
  Integer choice;

  @Column(name = "status", columnDefinition = "int")
  Integer status;
  @Column(name = "description", columnDefinition = "varchar(255) not null")
  String description;

  @Column(name = "created_at", columnDefinition = "datetime not null default current_timestamp")
  LocalDateTime created_at;
  @Column(name = "amount", columnDefinition = "decimal(10,2)")
  Double amount;


  @PrePersist
  public void prePersist() {
    created_at = LocalDateTime.now();
  }
}
