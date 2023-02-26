package demo.jdbc.spring.boot.DTO;

public class CustomerDto {

		private int id;
		private String name;
		private String email;
		private String password;
		private String mobile;
		public CustomerDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CustomerDto(int id, String name, String email, String password, String mobile) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.password = password;
			this.mobile = mobile;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		@Override
		public String toString() {
			return "CustomerDto [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
					+ ", mobile=" + mobile + "]";
		}

		
		
}
