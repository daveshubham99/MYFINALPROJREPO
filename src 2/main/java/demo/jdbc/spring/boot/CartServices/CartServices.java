package demo.jdbc.spring.boot.CartServices;

import java.util.List;

import demo.jdbc.spring.boot.DTO.CartDto;
import demo.jdbc.spring.boot.Entity.Cart;

public interface CartServices {

	String addToCart(CartDto cartDto);

	List<CartDto> getAllCart();

	int totalPrice();

}
