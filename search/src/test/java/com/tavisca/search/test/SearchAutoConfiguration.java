package com.tavisca.search.test;
/**
 * 
 */


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tavisca.search.rest.SearchController;
import com.tavisca.search.service.ISearchService;
import com.tavisca.search.service.impl.SearchServiceImpl;

/**
 * @author hiring
 *
 */
@Configuration
public class SearchAutoConfiguration {
	
	@Bean
	SearchController searchController() {
		return new SearchController();
	}
	
	@Bean 
	ISearchService iSearchService() {
		return new SearchServiceImpl();
	}

}
