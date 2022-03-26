/**
 * 
 */
package com.tcs.configration;

import org.springframework.context.annotation.Import;

import org.springframework.context.annotation.Configuration;



@Configuration
@Import({HelloAppConfig.class,CustomerAppConfig.class})

public class appConfig {
}

	