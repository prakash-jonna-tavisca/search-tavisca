/**
 * 
 */
package com.tavisca.search.service;

import com.tavisca.search.model.SearchCriteria;
import com.tavisca.search.model.SearchResponse;

/**
 * @author hiring
 *
 */
public interface ISearchService {
	   
       SearchResponse search(SearchCriteria pSearchCriteria);
}
