package com.chorume_dashboard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController
 */
@Controller
public class UserController {

  @GetMapping("/users")
  @ResponseBody
  public String index() {
    return "users/index";
  }

}
