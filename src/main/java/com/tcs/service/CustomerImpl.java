/**
 * 
 */
package com.tcs.service;

import java.util.Scanner;

/**
 * @author springuser07
 *
 */
public class CustomerImpl implements Customer {
	String name;
public String addCustomer() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Name=");
	name=sc.nextLine();
	System.out.println("Customer added successfully");
	return "Customer added successfully";
}

	@Override
	

public String delete() {
	System.out.println("Delete successfully");
	return "Delete successfully";
	
}
	@Override

public String show() {
	System.out.println("printed name" + name);
	return "printed name" + name;
	
}
				
	
}


