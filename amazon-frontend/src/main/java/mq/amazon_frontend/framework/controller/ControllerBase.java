package mq.amazon_frontend.framework.controller;

import mq.amazon_frontend.framework.model.PageModelBase;

public abstract class ControllerBase {

	protected PageModelBase pageModel;
	
	
	public ControllerBase( PageModelBase pmb){
		pageModel = pmb;
	}
}
