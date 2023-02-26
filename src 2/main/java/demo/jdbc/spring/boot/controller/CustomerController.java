package demo.jdbc.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.jdbc.spring.boot.DTO.CustomerDto;
import demo.jdbc.spring.boot.DTO.CustomerSaveDto;
import demo.jdbc.spring.boot.DTO.LoginDto;
import demo.jdbc.spring.boot.Entity.Customer;
import demo.jdbc.spring.boot.customerService.CustomerService;

@RestController
@CrossOrigin
@RequestMapping ("api/v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	boolean login = false;
	boolean admincheck =false;
	
	@PostMapping(path="/save")
	public String saveCustomer(@RequestBody CustomerSaveDto customerSaveDto )
	{
		System.out.println(customerSaveDto);
		String id = customerService.addCustomer(customerSaveDto);
		System.out.println(id);
		return id;
		
	}
	
	
	@GetMapping(path="/getallcustomer")
	public List<CustomerDto> getAllCustomer()
	{
		List<CustomerDto> allCustomer = customerService.getAllCustomer();
		return allCustomer;
		
	}
	
	
	@PostMapping("/login")
	public String login(@RequestBody LoginDto loginDto)
	{
		System.out.println(loginDto.getEmail());
		CustomerDto status = customerService.checkLogin(loginDto);
		System.out.println(status);
		
		 if(status == null)
		 {
			 System.out.println("init");
			return  "User not exist";
		 }
		 else
		 {
			 
			 login = true;
			 
			 return "user exist";
			 
			 }
	}
	
	
	@GetMapping(path="/islogin")
	public  boolean islogin()
	{
		if(login==true)
		{
			System.out.println("return");
		return true;
		
		}
		return false;
	}
	
	
	@GetMapping(path="/logout")
	public  boolean islogout()
	{
		
			
		return false;
		
		
		
		
	}
	
	
	@PostMapping(path="/admincheck")
	public String checkAdmin(@RequestBody LoginDto loginDto)
	{
		System.out.println("in");
		System.out.println(loginDto.getEmail());
		System.out.println(loginDto.getPassword());
		if(loginDto.getEmail().equals("admin")&&loginDto.getPassword().equals("1832"))
		{
			admincheck=true;
			return "admin exist";
			
		}

		return "admin not exist";
	}
	
	@GetMapping(path="/isadminlogin")
	public  boolean isadminlogin()
	{
		if(admincheck==true)
		{
			System.out.println("return");
		return true;
		
		}
		return false;
	}
	@GetMapping(path="/isadminlogout")
	public  boolean isadminlogout()
	{
		
			
		return false;
		
		
		
		
	}
	
	
	
	
	

}
