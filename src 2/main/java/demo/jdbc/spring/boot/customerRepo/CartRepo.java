package demo.jdbc.spring.boot.customerRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.jdbc.spring.boot.Entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer>{

	

}
