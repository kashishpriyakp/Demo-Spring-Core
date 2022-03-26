/**
 * 
 */
package com.tcs.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.tcs.service.HelloWorld;
import com.tcs.service.Customer;
import com.tcs.configration.appConfig;
import com.tcs.configration.CustomerAppConfig;

@SpringBootApplication
@ComponentScan({"com.tcs.*"})
@Import({appConfig.class})
@EnableAutoConfiguration


public class DemoSpringProjectApplication {
	public static void main(String[] args){
		ApplicationContext context = SpringApplication.run(appConfig.class);
		
		HelloWorld obj = (HelloWorld) context.getBean("hellobean");
		Customer obj1 = (Customer) context.getBean("hellobean1");
		
		obj.printHelloWorld("Srping5 Java Configuration demo to invoke the sevice");
		obj1.addCustomer();
		obj1.show();
		obj1.delete();
		
		
		     \\
		
	}
	
}
