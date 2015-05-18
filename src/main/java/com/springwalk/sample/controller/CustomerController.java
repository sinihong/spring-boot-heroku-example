/*
 * Copyright (c) 2015 SK C&C Co., Ltd. All rights reserved.
 *
 * This software is the confidential and proprietary information of SK C&C.
 * You shall not disclose such Confidential Information and shall use it
 * only in accordance wih the terms of the license agreement you entered into
 * with SK C&C.
 */
package com.springwalk.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springwalk.sample.model.Customer;
import com.springwalk.sample.repo.CustomerRepository;

/**
 * 
 * @author sini
 * @date May 18, 2015
 */
@RestController
public class CustomerController {
	@Autowired
	CustomerRepository repository;
	
	@RequestMapping(value="/customers", method=RequestMethod.GET)
	@ResponseBody
	public Iterable<Customer> getCustomers(){
		return repository.findAll();
	}
	@RequestMapping(value="/customers/{id}", method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable long id){
		return repository.findOne(id);
	}
	
	@RequestMapping(value="/customers", method=RequestMethod.POST)
	public void addCustomer(@RequestBody Customer customer){
		repository.save(customer);
	}
}
