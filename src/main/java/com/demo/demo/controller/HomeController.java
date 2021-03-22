package com.demo.demo.controller;


import com.atlassian.connect.spring.IgnoreJwt;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

public class HomeController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @IgnoreJwt
	
	    public String helloWorld() {
		 
	        return "hello";
	        
	    }
}

