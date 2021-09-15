package jdbcDemo;

import java.sql.*;

public class Jsql {
	public static final String driverName = "com.mysql.cj.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/empinfo";
	public static final String userName = "root";
	public static final String password = "pass";

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url, userName, password);
			System.out.println(con);

			ps = con.prepareStatement("select * from employee");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("id"));
				System.out.print(rs.getString("empName"));
				System.out.print(rs.getString("gender"));
				System.out.print(rs.getInt("salary"));
				System.out.print(rs.getString("mail"));
				System.out.print(rs.getString("address"));
				System.out.println("************************************");

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

}
