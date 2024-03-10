package BookStore.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import BookStore.entity.Book;
public class BookDAO {
	public static List<Book> queryBook(Connection conn) throws SQLException{
		String sql = "SELECT * FROM Book";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<Book> list = new ArrayList<Book>();
		while(rs.next()) {
			String bookId = rs.getString("BookId");
			String title = rs.getString("Title");
			String author = rs.getString("Author");
			int release = rs.getInt("Release");
			float price = rs.getFloat("Price");
			String picture = rs.getString("Picture");
			int publisherId = rs.getInt("PublisherId");
			int categoryId = rs.getInt("CategoryId");
			Book book = new Book();
			book.setBookId(bookId);
			book.setTitle(title);
			book.setAuthor(author);
			book.setRelease(release);
			book.setPrice(price);
			book.setPicture(picture);
			book.setPublisherId(publisherId);
			book.setCategoryId(categoryId);
			list.add(book);
			
		}
		return list;
	}
}
