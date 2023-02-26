package demo.jdbc.spring.boot.DTO;

public class ProductSaveDto {
	
	private String productName;
	private String productTags;
	private String productCompany;
	private String productPrice;
	public ProductSaveDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductSaveDto(String productName, String productTags, String productCompany, String productPrice) {
		super();
		this.productName = productName;
		this.productTags = productTags;
		this.productCompany = productCompany;
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductTags() {
		return productTags;
	}
	public void setProductTags(String productTags) {
		this.productTags = productTags;
	}
	public String getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "ProductSaveDto [productName=" + productName + ", productTags=" + productTags + ", productCompany="
				+ productCompany + ", productPrice=" + productPrice + "]";
	}
	

}
