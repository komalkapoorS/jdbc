import java.sql.*;
public class Get_stu {
		public static void getstudent() throws Exception {
			String url="jdbc:mysql://127.0.0.1:3306/sample";
			String username="root";
			String password="2003";
			String query="select * from ex";
			Connection con=DriverManager.getConnection(url,username,password);
			Statement pst=con.createStatement();
			ResultSet rs=pst.executeQuery(query);
			while(rs.next()) {
				
				System.out.println("id:"+rs.getInt(1));
				System.out.println("name:"+rs.getString(2));
				System.out.println("age:"+rs.getInt(3));
				System.out.println("email:"+rs.getString(4));
				System.out.println("city:"+rs.getString(5));
			}
			con.close();	
		}
		public static void main(String[] args) throws Exception{
			getstudent();		
			}
}
