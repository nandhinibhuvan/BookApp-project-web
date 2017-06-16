package test;

import dao.UserDAO;
import model.User;

public class TestUserLogin {

	public static void main(String[] args) throws Exception {
      

	        UserDAO userDAO = new UserDAO();
	        String email = "nandhinibhuvan10@gmail.com";
			String password = "12345";
			User user = userDAO.login(email, password);
	 System.out.println(user);
		

		}

	}

