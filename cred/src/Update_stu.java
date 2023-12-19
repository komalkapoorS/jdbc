import java.sql.*;
public class Update_stu {
	
	public static void updatestudent() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/sample";
		String username="root";
		String password="2003";
		String query="update ex set name='ramya',email='ramya@gmail.com' where id=1002";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args) throws Exception{
	updatestudent();
	}

}
