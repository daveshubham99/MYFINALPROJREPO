package demo.jdbc.spring.boot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	


		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int productid;
		private String productName;
		private String productTags;
		private String productCompany;
		private int productPrice;
		public Cart() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Cart(int productid, String productName, String productTags, String productCompany, int productPrice) {
			super();
			this.productid = productid;
			this.productName = productName;
			this.productTags = productTags;
			this.productCompany = productCompany;
			this.productPrice = productPrice;
		}
		public int getProductid() {
			return productid;
		}
		public void setProductid(int productid) {
			this.productid = productid;
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
		public int getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}
		@Override
		public String toString() {
			return "Cart [productid=" + productid + ", productName=" + productName + ", productTags=" + productTags
					+ ", productCompany=" + productCompany + ", productPrice=" + productPrice + "]";
		}
	

}
