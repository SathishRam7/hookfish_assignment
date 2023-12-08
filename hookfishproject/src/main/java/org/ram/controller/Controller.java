package org.ram.controller;

import java.util.List;

import org.ram.entity.Customer;
import org.ram.repo.CustomerRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private CustomerRepositary customerrepo;
	
	@GetMapping("/hi")
	public String  hi() {
		return "hii";
	}
	
	@PostMapping("/register")
	public void register(@RequestBody Customer customer) {
	customerrepo.save(customer);
	}
	
	@GetMapping("/listcustomer")
	public List<Customer>retrievecustomers(){
		return customerrepo.findAll();
	}
	
}
