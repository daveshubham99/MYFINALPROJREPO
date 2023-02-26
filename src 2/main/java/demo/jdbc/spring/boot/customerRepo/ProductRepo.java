package demo.jdbc.spring.boot.customerRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import demo.jdbc.spring.boot.Entity.Products;
@EnableJpaRepositories
@Repository
public interface ProductRepo extends JpaRepository<Products,Integer>{

}
