package framework.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class ApplicationController {

	@Autowired
	private HeaderController headerController = null;
	
	@Autowired
	private SearchController searchController = null;

	
	public HeaderController getHeader(){
		return headerController;
	}

}
