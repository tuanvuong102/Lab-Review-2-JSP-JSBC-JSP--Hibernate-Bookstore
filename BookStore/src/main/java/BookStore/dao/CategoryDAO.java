package BookStore.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import BookStore.entity.Category;
public class CategoryDAO {
	public static List<Category> queryCategory(Connection conn) throws SQLException{
		String sql = "SELECT * FROM Category";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<Category> list = new ArrayList<Category>();
		while(rs.next()) {
			String categoryName = rs.getString("CategoryName");
			int categoryId = rs.getInt("CategoryId");
			Category category = new Category();
			category.setCategoryId(categoryId);
			category.setCategoryName(categoryName);
			list.add(category);
			
		}
		return list;
	}
}
