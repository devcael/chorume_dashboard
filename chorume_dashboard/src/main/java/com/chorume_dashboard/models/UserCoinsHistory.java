package com.chorume_dashboard.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * UserCoinsHistory
 */
@Entity
@Table(name = "users_coins_history")
@NoArgsConstructor
@Getter
@Setter
public class UserCoinsHistory {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  Integer id;
  @Column(name = "user_id")
  Integer user_id;
  @Column(name = "entity_id")
  Integer entity_id;
  @Column(name = "amount")
  Double amount;
  @Column(name = "type")
  String type;
  @Column(name = "description")
  String description;
  @Column(name = "created_at")
  Date created_at;
}
