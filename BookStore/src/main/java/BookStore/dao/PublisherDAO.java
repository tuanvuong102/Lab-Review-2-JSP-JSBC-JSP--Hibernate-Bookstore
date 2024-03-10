package BookStore.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import BookStore.entity.Publisher;
public class PublisherDAO {
	public static List<Publisher> queryPublisher(Connection conn) throws SQLException{
		String sql = "SELECT * FROM Publisher";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<Publisher> list = new ArrayList<Publisher>();
		while(rs.next()) {
			int publisherId = rs.getInt("PublisherId");
			String publisherName = rs.getString("PublisherName");
			String phone = rs.getString("Phone");
			String address = rs.getString("Address");
			Publisher publisher = new Publisher();
			publisher.setPublisherId(publisherId);
			publisher.setPublisherName(publisherName);
			publisher.setPhone(phone);
			publisher.setAddress(address);
			list.add(publisher);
		}
		return list;
	}
}
