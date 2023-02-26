package demo.jdbc.spring.boot.CartServices;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.jdbc.spring.boot.DTO.CartDto;
import demo.jdbc.spring.boot.DTO.CustomerDto;
import demo.jdbc.spring.boot.Entity.Cart;
import demo.jdbc.spring.boot.Entity.Customer;
import demo.jdbc.spring.boot.Entity.Products;
import demo.jdbc.spring.boot.customerRepo.CartRepo;

@Service
public class CartServicesImpl implements CartServices{

	@Autowired
	CartRepo cartRepo;
	
	
	@Override
	public String addToCart(CartDto cartDto) {
		
		Cart cart = new Cart(
				
				cartDto.getProductid(),
				cartDto.getProductName(),
				cartDto.getProductTags(),
				cartDto.getProductCompany(),
				cartDto.getProductPrice()

				
				);
		cartRepo.save(cart);

		return cart.getProductName();
		
	}


	@Override
	public List<CartDto> getAllCart() {
		List<Cart> getallcart = cartRepo.findAll();
		List<CartDto> cartDtoList=new ArrayList<>();
		for(Cart a :getallcart)
		{
			CartDto cartDto= new CartDto(
					
					a.getProductid(),
					a.getProductName(),
					a.getProductTags(),
					a.getProductCompany(),
					a.getProductPrice()

					);
			cartDtoList.add(cartDto);
			
		}	
			
		return cartDtoList;
	

}


	@Override
	public int totalPrice() {
		int totalprice=0;
		List<Cart> getallcart = cartRepo.findAll();
		for(Cart a :getallcart)
		{
CartDto cartDto= new CartDto(
					
					a.getProductid(),
					a.getProductName(),
					a.getProductTags(),
					a.getProductCompany(),
					a.getProductPrice()

					);

				totalprice=totalprice+a.getProductPrice();
		}
		
		return totalprice;
		
	}
}
