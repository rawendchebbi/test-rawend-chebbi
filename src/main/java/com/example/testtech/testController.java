package com.example.testtech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

     @GetMapping("/welcome")
    public String first_api(){
  
        return "welcome to my API project !";
    }
    
}
