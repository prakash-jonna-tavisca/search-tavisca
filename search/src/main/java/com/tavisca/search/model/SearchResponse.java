package com.tavisca.search.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponse {
     
	@JsonProperty("searchResultList")
	private List<SearchResult> searchResultList;

	@JsonProperty("searchResultList")
	public List<SearchResult> getSearchResultList() {
		return searchResultList;
	}

	public void setSearchResultList(List<SearchResult> searchResultList) {
		this.searchResultList = searchResultList;
	}
	
	
}
