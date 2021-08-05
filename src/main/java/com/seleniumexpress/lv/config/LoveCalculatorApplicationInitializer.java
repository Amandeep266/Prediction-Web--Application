package com.seleniumexpress.lv.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext sc) throws ServletException {

	
		AnnotationConfigWebApplicationContext webapplicationcontext=new AnnotationConfigWebApplicationContext();
		
		webapplicationcontext.register(LoveCalculatorAppConfig.class);
		
		DispatcherServlet ds= new DispatcherServlet(webapplicationcontext);
		
		ServletRegistration.Dynamic myCustomDsServlet= sc.addServlet("myServlet",ds);		
		
		myCustomDsServlet.setLoadOnStartup(1);
		
		myCustomDsServlet.addMapping("/");
		
		
 		
	}

}
