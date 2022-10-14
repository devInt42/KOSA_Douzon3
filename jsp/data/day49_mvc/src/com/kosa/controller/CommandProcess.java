package com.kosa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandProcess {
	
	public String doProcess(HttpServletRequest request,  
			HttpServletResponse  response) throws Throwable;
		
}
