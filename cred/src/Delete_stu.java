import java.sql.*;

public class Delete_stu {
	
	public static void deletestudent() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/sample";
		String username="root";
		String password="2003";
		String query="delete from ex where id=1001";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.executeUpdate();
		con.close();	
	}
	public static void main(String[] args) throws Exception{
	deletestudent();		
	}
}
