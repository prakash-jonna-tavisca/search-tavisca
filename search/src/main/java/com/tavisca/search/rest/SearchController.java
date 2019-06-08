package com.tavisca.search.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tavisca.search.model.SearchCriteria;
import com.tavisca.search.model.SearchResponse;
import com.tavisca.search.rest.model.SearchRestResponse;
import com.tavisca.search.service.ISearchService;

@RestController
public class SearchController {
	
	@Autowired
	ISearchService searchService;
	
	@GetMapping("/search")
	public SearchRestResponse search(@RequestParam String city,@RequestParam String category) {

		
		SearchResponse lSearchResponse = searchService.search(new SearchCriteria().setCity(city).setCategory(category));
		
		
		SearchRestResponse lSearchRestResponse = new SearchRestResponse();
		//transform the response received from server into rest compatible POJO and return
		return lSearchRestResponse;
		
	}
	

}
