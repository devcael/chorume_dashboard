package com.chorume_dashboard.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "events_bets")
public class EventsBets {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  @Column(name = "user_id", columnDefinition = "int unsigned not null")
  Integer userId;
  @Column(name = "event_id", columnDefinition = "int unsigned not null")
  Integer eventId;
  @Column(name = "choice_id", columnDefinition = "int unsigned not null")
  Integer choiceId;
  @Column(name = "amount", columnDefinition = "decimal(10,2) not null")
  Double amount;
  @Column(name = "created_at", columnDefinition = "datetime not null default current_timestamp")
  LocalDateTime created_at;

  @PrePersist
  public void prePersist() {
    created_at = LocalDateTime.now();
  }
}
