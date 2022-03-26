/**
 * 
 */

package com.tcs.configration;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.tcs.service.HelloWorld;
import com.tcs.service.HelloWorldImpl;

@Configuration
public class HelloAppConfig {
	@Bean(name="hellobean")
	public HelloWorld helloworld() {
		return new HelloWorldImpl();
	}
}
