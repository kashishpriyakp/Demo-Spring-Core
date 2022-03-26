/**
 * 
 */
package com.tcs.configration;

/**
 * @author springuser07
 *
 */

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import com.tcs.service.Customer;
import com.tcs.service.CustomerImpl;


	@Configuration
	public class CustomerAppConfig {
		@Bean(name="hellobean1")
		public Customer customer() {
			return new CustomerImpl();
		}
	}


