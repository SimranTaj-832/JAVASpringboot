package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Samp_PrepStmList {

	public static void main(String[] args) {
		
		System.out.println("Querying a table example");
		Connection con = null;
		int i1;String s1,s2,s3;double d1;
		ArrayList<Emply> arlist= new ArrayList<Emply>();
		EmpList elist=new EmpList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException exob1) {}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","admin123");
		}catch(SQLException exob2) {}
		try {
			PreparedStatement pst=con.prepareStatement("SELECT*FROM emp");
			ResultSet rs;
			rs=pst.executeQuery();
			while(rs.next()) {
				i1=rs.getInt("eid");
				s1=rs.getString("ename");
				d1=rs.getDouble("esal");
				s2=rs.getString("ejdate");
				s3=rs.getString("ecity");
				arlist.add(new Emply(i1,s1,s2,d1,s3));
			}
		}catch(SQLException s) {System.out.println("Table or column or data type is not found");}
		catch(Exception e) {e.printStackTrace();}
		System.out.println(arlist);
		elist.setAr1(arlist);
		System.out.println(elist);
		try {
			con.close();
		}catch(Exception e) {e.printStackTrace();}
	}

}
