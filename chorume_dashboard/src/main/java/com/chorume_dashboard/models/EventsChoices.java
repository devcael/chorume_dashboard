package com.chorume_dashboard.models;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "events_choices")
public class EventsChoices {
  @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  @Column(name = "event_id", columnDefinition = "int unsigned not null")
  Integer eventId;
  @Column(name = "choice_key", columnDefinition = "varchar(255) not null")
  String choiceKey;
  @Column(name = "description", columnDefinition = "varchar(255) not null")
  String description;
}
