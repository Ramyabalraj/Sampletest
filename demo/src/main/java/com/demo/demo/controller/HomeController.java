package com.demo.demo.controller;


import com.atlassian.connect.spring.IgnoreJwt;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

public class HomeController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @IgnoreJwt
	@ResponseBody
	    public String helloWorld() {
		  HttpResponse<JsonNode> response = null;
		try {
			response = Unirest.get("https://jirauat.atlassian.net/rest/api/3/myself")
					  .basicAuth("ramya.balraj@kgisl.com", "cUapwmIGGklbxxCVm8NA0C28")
					  .header("Accept", "application/json")
					  .asJson();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				System.out.println("********************************"+response.getBody()+"********************************************");
	        return "True";
	        
	    }
}

