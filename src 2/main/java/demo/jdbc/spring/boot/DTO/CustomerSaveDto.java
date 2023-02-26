package demo.jdbc.spring.boot.DTO;

public class CustomerSaveDto {
	
	private String name;
	private String email;
	private String password;
	private String mobile;
	public CustomerSaveDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerSaveDto(String name, String email, String password, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	
	
	@Override
	public String toString() {
		return "CustomerSaveDto [name=" + name + ", email=" + email + ", password=" + password + ", mobile=" + mobile
				+ "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
