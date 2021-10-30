package com.example.app.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageGenerator {
	
	  
	@GetMapping("message-generator")
	public String getMessage(@RequestHeader("userName")String userName) {
		Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay < 12){
            return "Good morning :: "+userName;
        }else if(timeOfDay < 16){
            return "Good afternoon :: "+userName;
        }else if(timeOfDay < 21){
            return "Good evening :: "+userName;
        }else {
            return "Good night :: "+userName;
        }
	}
	 
}
