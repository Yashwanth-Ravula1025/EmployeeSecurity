/**
 * 
 */
package com.ust.EmployeeSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/noauth")
public class Controller2 {
	@GetMapping("/goodmorning")
	public String greeting() {
		return "hi sharath good morning ";
		
	}

}