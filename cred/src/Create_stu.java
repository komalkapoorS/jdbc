import java.sql.*;
public class Create_stu {
	
	public static void createstudent() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/sample";
		String username="root";
		String password="2003";
		String query="insert into ex values(?,?,?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, 1002);
		pst.setString(2,"Shre");
		pst.setInt(3, 28);
		pst.setString(4, "shre@gmail.com");
		pst.setString(5, "chennai");
		pst.executeUpdate();
		con.close();
	}
	
	public static void main(String[] args) throws Exception {
	createstudent()	;
	}
}
