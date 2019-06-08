/**
 * 
 */
package com.tavisca.search.service.impl;

import com.tavisca.search.model.SearchCriteria;
import com.tavisca.search.model.SearchResponse;
import com.tavisca.search.service.ISearchService;

/**
 * @author hiring
 *
 */
public class SearchServiceImpl implements ISearchService {

	/* (non-Javadoc)
	 * @see com.tavisca.search.service.ISearchService#search(com.tavisca.search.model.SearchCriteria)
	 */
	@Override
	public SearchResponse search(SearchCriteria pSearchCriteria) {
		// talk to all the search service providers and collect the responses
		return null;
	}

}
