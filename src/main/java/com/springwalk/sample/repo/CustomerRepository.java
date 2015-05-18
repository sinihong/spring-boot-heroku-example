/*
 * Copyright (c) 2015 SK C&C Co., Ltd. All rights reserved.
 *
 * This software is the confidential and proprietary information of SK C&C.
 * You shall not disclose such Confidential Information and shall use it
 * only in accordance wih the terms of the license agreement you entered into
 * with SK C&C.
 */
package com.springwalk.sample.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springwalk.sample.model.Customer;

/**
 * 
 * @author sini
 * @date May 18, 2015
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	List<Customer> findByLastName(String lastName);
}
