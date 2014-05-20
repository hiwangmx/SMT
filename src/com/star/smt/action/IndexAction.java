package com.star.smt.action;

public class IndexAction extends BaseAction{

	private static final long serialVersionUID = 1L;

	public String noFoundPage(){
		return "404";
	}
	
	public String index(){
		return "index";
	}
	
}
