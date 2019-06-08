package com.tavisca.search.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResult {

	@JsonProperty("city")
	private String city;
	
	@JsonProperty("pinCode")
	private String pinCode;
	
	@JsonProperty("city")
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@JsonProperty("pinCode")
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
