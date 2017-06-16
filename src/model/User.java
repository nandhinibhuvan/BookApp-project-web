package model;

import java.time.LocalDate;

public class User {




	    @Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", joined_Date="
					+ joined_Date + "]";
		}
	    private Integer id;
		private String name;
	    private String email;
	    private String password;
	    private LocalDate joined_Date;
	    
		public void setId(Integer id) {
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
		public LocalDate getJoined_Date() {
			return joined_Date;
		}
		public void setJoined_Date(LocalDate joined_Date) {
			this.joined_Date = joined_Date;
		}
		
	    

	}

