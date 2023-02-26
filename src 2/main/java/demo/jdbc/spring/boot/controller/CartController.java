package demo.jdbc.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.jdbc.spring.boot.CartServices.CartServices;
import demo.jdbc.spring.boot.DTO.CartDto;
import demo.jdbc.spring.boot.DTO.CustomerDto;
import demo.jdbc.spring.boot.Entity.Cart;
import demo.jdbc.spring.boot.customerRepo.CartRepo;

@RestController
@CrossOrigin
@RequestMapping ("api/v1/product")
public class CartController {
	
	@Autowired
	CartServices cartService;
	
	@PostMapping(path="/savecart")
	public String addToCaart(@RequestBody CartDto cartDto)
	{
		String message = cartService.addToCart(cartDto);
		
		
		return message;
		
	}
	@GetMapping(path="/getallcart")
	public List<CartDto> getAllCart()
	{
		List<CartDto> allCart = cartService.getAllCart();
		return allCart;
		
	}
	
	@GetMapping(path="/totalprice")
	public int totalPrice()
	{
		System.out.println("invoke");
		
		int total =cartService.totalPrice();

		return total;
		
	}
	
	

}
