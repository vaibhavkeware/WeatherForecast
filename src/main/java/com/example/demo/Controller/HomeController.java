package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.WeatherDTO;

@RestController
@RequestMapping("/weather")
public class HomeController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/forecast")
    public ResponseEntity<String> getForecast(@RequestBody WeatherDTO weatherDTO) throws Exception {
		
    	String url = "https://forecast9.p.rapidapi.com/rapidapi/forecast/"+weatherDTO.getCity()+"/summary/";
    	try {
    		
    		HttpHeaders headers = new HttpHeaders();
    		headers.set("X-RapidAPI-Key",weatherDTO.getxRapidKey());
    		headers.set("X-RapidAPI-Host", weatherDTO.getRapidHost());
    		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers),String.class);
    	
    		return response;
    	}catch (Exception e) {
    		
    		throw new Exception();
    	}
    }
	
	@GetMapping("/hourlyforecast")
	public ResponseEntity<String> getHourlyForeCast(@RequestBody WeatherDTO weatherDTO) throws Exception{
    	
    	String url = "https://forecast9.p.rapidapi.com/rapidapi/forecast/"+weatherDTO.getCity()+"/hourly/";
    	
    	try {
    		
    		HttpHeaders headers = new HttpHeaders();
    		headers.set("X-RapidAPI-Key",weatherDTO.getxRapidKey());
    		headers.set("X-RapidAPI-Host", weatherDTO.getRapidHost());
    		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers),String.class);
    	
    		return response;
    	} catch (Exception e) {
    		
    		throw new Exception();
    	}
	}
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception e) {
		return "failed to connect to Rapid Api";
	}
}
