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
@Table(name = "roulette_bet")
public class RouletteBet {
  @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  @Column(name = "user_id", columnDefinition = "int unsigned")
  Integer userId;
  @Column(name = "roulette_id", columnDefinition = "int unsigned")
  Integer rouletteId;
  @Column(name = "bet_amount", columnDefinition = "int")
  Integer betAmount;
  @Column(name = "choice", columnDefinition = "int")
  Integer choice;
  @Column(name = "created_at", columnDefinition = "datetime not null default current_timestamp")
  LocalDateTime created_at;

  @PrePersist
  public void prePersist() {
    created_at = LocalDateTime.now();
  }
}
