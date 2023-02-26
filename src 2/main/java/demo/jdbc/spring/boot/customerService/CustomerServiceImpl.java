package demo.jdbc.spring.boot.customerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.jdbc.spring.boot.DTO.CustomerDto;
import demo.jdbc.spring.boot.DTO.CustomerSaveDto;
import demo.jdbc.spring.boot.DTO.LoginDto;
import demo.jdbc.spring.boot.Entity.Customer;
import demo.jdbc.spring.boot.customerRepo.CustomerRepo;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepo customerRepo;
	
	
	@Override
	public String addCustomer(CustomerSaveDto customerSaveDto) {
		Customer customer = new Customer(
				
			    customerSaveDto.getName(),
				customerSaveDto.getEmail(),
				customerSaveDto.getPassword(),
				customerSaveDto.getMobile()
	
				
				);
		customerRepo.save(customer);
		return customer.getName();
	}


	@Override
	public List<CustomerDto> getAllCustomer() {
		List<Customer> getallcustomer = customerRepo.findAll();
		List<CustomerDto> customerDtoList=new ArrayList<>();
		for(Customer a :getallcustomer)
		{
			CustomerDto customerDto = new CustomerDto(
					
					a.getId(),
					a.getName(),
					a.getEmail(),
					a.getMobile(),
					a.getPassword()

					);
			customerDtoList.add(customerDto);
			
			
			
		}
		
		
		return customerDtoList;
	}


	@Override
	public CustomerDto checkLogin(LoginDto loginDto) {
		System.out.println(loginDto.getEmail());
		
		Customer customer= customerRepo.findByEmail(loginDto.getEmail());
		
		if (customer==null)
		{
			return null;
			
		}
		CustomerDto customerDto= new CustomerDto(
				
				customer.getId(),
				customer.getName(),
				customer.getEmail(),
				customer.getPassword(),
				customer.getMobile()
				
				
				);

		if(customerDto==null)
		{
			return null;
			
		}
		System.out.println(customerDto.getPassword());
		System.out.println(loginDto.getPassword());
		if(!customerDto.getPassword().equals(loginDto.getPassword())){
			return null;
        }
		System.out.println("returning");
		 return customerDto;

	}


	
	

}