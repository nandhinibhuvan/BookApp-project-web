package test;

import dao.UserDAO;
import model.User;

public class TestUserDAO {


	public static void main(String[] args) throws Exception {
		User user = new User();
        user.setName("nandhini");
        user.setEmail("nandhinibhuvan10@gmail.com");
        user.setPassword("12345");
 
        UserDAO userDAO = new UserDAO();
        userDAO.register(user);
 
	

	}

}


