/*
 * Copyright (c) 2015 SK C&C Co., Ltd. All rights reserved.
 *
 * This software is the confidential and proprietary information of SK C&C.
 * You shall not disclose such Confidential Information and shall use it
 * only in accordance wih the terms of the license agreement you entered into
 * with SK C&C.
 */
package com.springwalk.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author sini
 * @date May 18, 2015
 */
@SpringBootApplication
@RestController
public class SampleApplication {

	@RequestMapping("/")
	public String home(){
		return "Hello World!";
	}
	
	public static void main(String[] args){
		SpringApplication.run(SampleApplication.class, args);
	}
}
