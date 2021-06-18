package com.seleniumexpress.lv.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext sc) throws ServletException {
////		XmlWebApplicationContext wac=new XmlWebApplicationContext();
////		wac.setConfigLocation("/WEB-INF/application-config.xml");  this class is used when our configuration  is in xml file
	
	//creating a container
		AnnotationConfigWebApplicationContext webapplicationcontext=new AnnotationConfigWebApplicationContext();
		
		webapplicationcontext.register(LoveCalculatorAppConfig.class);
		
		
		// create a dispatcher servlet object
		
		DispatcherServlet ds= new DispatcherServlet(webapplicationcontext);
		//Register dispatcher servlet with servlet context
		ServletRegistration.Dynamic myCustomDsServlet= sc.addServlet("myServlet",ds);		
		myCustomDsServlet.setLoadOnStartup(1);
		myCustomDsServlet.addMapping("/");
		
		
 		
	}

}
