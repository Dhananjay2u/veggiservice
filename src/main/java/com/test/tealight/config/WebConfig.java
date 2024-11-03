package com.test.tealight.config;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
	 @Override public void configureMessageConverters(List<HttpMessageConverter<?>> converters) { 
		 converters.add(new MappingJackson2HttpMessageConverter()); // Add other converters if needed
		 converters.add(new FormHttpMessageConverter()); // Add other converters if needed
		 converters.add(new StringHttpMessageConverter(StandardCharsets.UTF_8));
	}

}
