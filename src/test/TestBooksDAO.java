package test;

import java.time.LocalDate;

import dao.BookDAO;
import model.Book;


public class TestBooksDAO {

	
	
	public static void main(String[] args) throws Exception {
	Book user = new Book();
    user.setName("nandhini");
    user.setPrice(150);
    user.setAuthor_id(1);
    user.setPublished_date(LocalDate.now());

    BookDAO userDAO = new BookDAO();
    userDAO.register(user);


}
}


