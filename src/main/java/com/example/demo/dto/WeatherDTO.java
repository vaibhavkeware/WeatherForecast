package com.example.demo.dto;

import org.springframework.stereotype.Component;

@Component
public class WeatherDTO {

	private String city;
	private String xRapidKey;
	private String rapidHost;
	@Override
	public String toString() {
		return "WeatherDTO [city=" + city + ", xRapidKey=" + xRapidKey + ", rapidHost=" + rapidHost + "]";
	}
	public WeatherDTO(String city, String xRapidKey, String rapidHost) {
		super();
		this.city = city;
		this.xRapidKey = xRapidKey;
		this.rapidHost = rapidHost;
	}
	public WeatherDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getxRapidKey() {
		return xRapidKey;
	}
	public void setxRapidKey(String xRapidKey) {
		this.xRapidKey = xRapidKey;
	}
	public String getRapidHost() {
		return rapidHost;
	}
	public void setRapidHost(String rapidHost) {
		this.rapidHost = rapidHost;
	}
	
	
}
