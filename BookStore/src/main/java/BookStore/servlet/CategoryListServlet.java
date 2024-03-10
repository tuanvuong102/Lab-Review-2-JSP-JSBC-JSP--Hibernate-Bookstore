package BookStore.servlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import BookStore.dao.CategoryDAO;
import BookStore.conn.ConnectionUtils;
import BookStore.entity.Category;

@WebServlet("/categoryList")
public class CategoryListServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public CategoryListServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		Connection conn = null;
		String errorString = null;
		List<Category> list = null;
		try {
			conn = ConnectionUtils.getMSSQLConnection();
			try {
				list = CategoryDAO.queryCategory(conn);
				
			}catch(SQLException e) {
				e.printStackTrace();
				errorString = e.getMessage();
			}
			request.setAttribute("errorString", errorString);
			request.setAttribute("categoryList", list);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/categoryList.jsp");
			dispatcher.forward(request, response);
			
		}catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
			errorString = e1.getMessage();
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/categoryList.jsp");
			request.setAttribute("errorString", errorString);
			dispatcher.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		doGet(request,response);
	}
}
