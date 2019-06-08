/**
 * 
 */
package com.tavisca.search.model;

/**
 * @author hiring
 *
 */
public class SearchCriteria {
      private String city;
      private String category;
      
      public SearchCriteria(String pCity, String pCategory) {
    	  this.city = pCity;
    	  this.category = pCategory;
      }
      
      public SearchCriteria() {
    	  this.city = "";
    	  this.category = "";
      }

	public String getCity() {
		return city;
	}

	public SearchCriteria setCity(String city) {
		this.city = city;
		return this;
	}

	public String getCategory() {
		return category;
	}

	public SearchCriteria setCategory(String category) {
		this.category = category;
		return this;
	}
      
      
      
}
