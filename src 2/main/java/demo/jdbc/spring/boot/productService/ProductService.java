package demo.jdbc.spring.boot.productService;

import java.util.List;

import demo.jdbc.spring.boot.DTO.ProductDto;
import demo.jdbc.spring.boot.DTO.ProductSaveDto;

public interface ProductService {

	List<ProductDto> getAllProducts();

	String addCustomer(ProductSaveDto productSaveDto);

	String deleteItem(int productid);

	String updateCustomer(ProductDto productDto);

}
