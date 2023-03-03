package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;
import com.example.demo.Service.Apiservice;

@RestController
public class ApiController {
	@Autowired
	EmployeeRepo servicerespository;
	@Autowired
	Apiservice rep;
	@GetMapping("/")
	List<Employee> getlist()
	{
		return servicerespository.findAll();
	}
	@GetMapping("/get/{id3}")
	public Optional<Employee> getbyid(@PathVariable int id3){
		return rep.getdetails(id3);
	}
	@PostMapping("/post")
	public Employee create(@RequestBody Employee d)
	{
		return servicerespository.save(d);
	}
	
}
