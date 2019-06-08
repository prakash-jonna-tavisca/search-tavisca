package com.tavisca.search.service.impl.mock;

import java.util.ArrayList;
import java.util.List;

import com.tavisca.search.model.SearchCriteria;
import com.tavisca.search.model.SearchResponse;
import com.tavisca.search.model.SearchResult;
import com.tavisca.search.service.ISearchService;

public class SearchServiceMockImpl implements ISearchService {

	@Override
	public SearchResponse search(SearchCriteria pSearchCriteria) {
		SearchResponse lSearchResponse = new SearchResponse();
		
		List<SearchResult> lSearchResultList = new ArrayList<>();
		SearchResult lSearchResult = new SearchResult();
		lSearchResult.setCity("pune");
		lSearchResult.setPinCode("PUNE12345");
		
		lSearchResultList.add(lSearchResult);
		
		lSearchResult = new SearchResult();
		lSearchResult.setCity("patna");
		lSearchResult.setPinCode("PATNA12345");
		
		lSearchResultList.add(lSearchResult);
		
		lSearchResponse.setSearchResultList(lSearchResultList);
		
		return lSearchResponse;
		
	}

}
