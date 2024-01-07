package com.chorume_dashboard.controllers;

import com.chorume_dashboard.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController
 */
@Controller
public class UserController {
  @Autowired
  UserRepository userRepository;

  @GetMapping("/users")
  @ResponseBody
  public ResponseEntity<?> index() {
    return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
  }

}
