package com.gul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class MyController {
  
  @RequestMapping
  @ResponseBody
  public String handleRequest () {
      System.out.println("-- handling request in controller --");
      return "dummy response from MyController";
  }
}
