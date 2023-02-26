package demo.jdbc.spring.boot.customerService;

import java.util.List;

import demo.jdbc.spring.boot.DTO.CustomerDto;
import demo.jdbc.spring.boot.DTO.CustomerSaveDto;
import demo.jdbc.spring.boot.DTO.LoginDto;
import demo.jdbc.spring.boot.Entity.Customer;

public interface CustomerService {

	 String addCustomer(CustomerSaveDto customerSaveDto);

	List<CustomerDto> getAllCustomer();

	CustomerDto checkLogin(LoginDto loginDto);

	
	

	
}
