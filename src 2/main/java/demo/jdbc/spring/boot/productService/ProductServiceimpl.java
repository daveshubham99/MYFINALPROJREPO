package demo.jdbc.spring.boot.productService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.jdbc.spring.boot.DTO.ProductDto;
import demo.jdbc.spring.boot.DTO.ProductSaveDto;
import demo.jdbc.spring.boot.Entity.Customer;
import demo.jdbc.spring.boot.Entity.Products;
import demo.jdbc.spring.boot.customerRepo.ProductRepo;

@Service
public class ProductServiceimpl implements ProductService{

	@Autowired
	ProductRepo productRepo;
	
	
	
	@Override
	public List<ProductDto> getAllProducts() {
		List<Products> getAllProduct = productRepo.findAll();
		List<ProductDto> listOfProducts = new ArrayList<>();
		for (Products a : getAllProduct)
		{
			ProductDto productDto = new ProductDto(
					
					
					a.getProductid(),
					a.getProductName(),
					a.getProductTags(),
					a.getProductCompany(),
					a.getProductPrice()
			
					
					);
			listOfProducts.add(productDto);
		}
		return listOfProducts;
	}



	@Override
	public String addCustomer(ProductSaveDto productSaveDto) {
		Products products = new Products(
				
				productSaveDto.getProductName(),
				productSaveDto.getProductTags(),
				productSaveDto.getProductCompany(),
				productSaveDto.getProductPrice()
				
				
				
				);
		productRepo.save(products);
		return "product succesfully entered";
	}



	@Override
	public String deleteItem(int productid) {
		Products products = productRepo.getReferenceById(productid);
		productRepo.deleteById(productid);
		return products.getProductName();
	}



	@Override
	public String updateCustomer(ProductDto productDto) {
		if(productRepo.existsById(productDto.getProductid()))
		{
			Products product = productRepo.getById(productDto.getProductid());
			System.out.println("in update");
			product.setProductName(productDto.getProductName());
			product.setProductTags(productDto.getProductTags());
			product.setProductCompany(productDto.getProductCompany());
			product.setProductPrice(productDto.getProductPrice());
			productRepo.save(product);
		}
		return "User updated succefully";
	}

}
