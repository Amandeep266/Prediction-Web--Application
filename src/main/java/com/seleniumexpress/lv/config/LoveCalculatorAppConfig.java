package com.seleniumexpress.lv.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


import com.seleniumexpress.lv.formatter.PhoneNumberformatter;

@Configuration
@ComponentScan(basePackages="com.seleniumexpress")
@EnableWebMvc
public class LoveCalculatorAppConfig implements WebMvcConfigurer {

	
	@Bean
	InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/view/");
		vr.setSuffix(".jsp");
		return vr;
	}
	@Bean
	public JavaMailSender getJavaMailSender()
	{
		JavaMailSenderImpl imp=new JavaMailSenderImpl();
		imp.setHost("smtp.gmail.com");
		imp.setUsername("amandeepkaur9304@gmail.com");
			imp.setPassword("aman1010#");
			Properties mp=new Properties();
			mp.put("mail.smtp.starttls.enable",true);
			mp.put("mail.smtp.ssl.trust", "smtp.gmail.com");
			imp.setJavaMailProperties(mp);
			imp.setPort(587);
			return imp;
	}
@Override
public void addFormatters(FormatterRegistry registry)
{
registry.addFormatter(new PhoneNumberformatter() );

}

//@Override
//public Validator getValidator() {
//	// TODO Auto-generated method stub
//	return WebMvcConfigurer.super.getValidator();
//}
}

