package demo.jdbc.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.jdbc.spring.boot.DTO.CustomerSaveDto;
import demo.jdbc.spring.boot.DTO.ProductDto;
import demo.jdbc.spring.boot.DTO.ProductSaveDto;
import demo.jdbc.spring.boot.Entity.Products;
import demo.jdbc.spring.boot.productService.ProductService;

@RestController
@CrossOrigin
@RequestMapping ("api/v1/product")
public class ProductController {
	
			@Autowired
			ProductService productService;

			
			
			
		@GetMapping(path="/getallproducts")	
		public List<ProductDto> getAllProducts()
		{
			List<ProductDto> getAllProducts = productService.getAllProducts();
			
			return getAllProducts;
		}
	
		
		@PostMapping(path="/save")
		public String saveProduct(@RequestBody ProductSaveDto productSaveDto )
		{
			System.out.println(productSaveDto);
			String id = productService.addCustomer(productSaveDto);
			System.out.println(id);
			return id;
			
		}
		
		
		@PostMapping(path="/deletebyid")
		public String deleteProduct(@RequestBody Products product )
		{
			System.out.println(product.getProductid());
			String deleteItem = productService.deleteItem(product.getProductid());
			
			
				return deleteItem;
		}
		
		
		@PostMapping(path="/update")
		public String update(@RequestBody ProductDto productDto )
		{
			System.out.println(productDto);
			String id = productService.updateCustomer(productDto);
			System.out.println(id);
			return id;
			
		}
		
		

	
	
	
	
}
