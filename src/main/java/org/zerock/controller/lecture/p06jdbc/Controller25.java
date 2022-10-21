package org.zerock.controller.lecture.p06jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex25")
public class Controller25 {

	@Autowired
	private DataSource dataSourse;
	
	@RequestMapping("sub01")
	public void method() throws Exception {
		String sql = "INSERT INTO myTable07 (col1,col2,col3,col4,col5,col6) "
				+ "VALUES (?,?,?,?,?,?)";
		
			try(Connection con = dataSourse.getConnection();
					PreparedStatement pstmt = con.prepareStatement(sql);){
				
				pstmt.setInt(1, 999999);
				pstmt.setDouble(2, 2556.897);
				pstmt.setString(3, "hello world");
				pstmt.setString(4, "sql");
				pstmt.setDate(5, java.sql.Date.valueOf("2022-10-21"));
				pstmt.setTimestamp(6, java.sql.Timestamp.valueOf("2022-10-21 11:15:00"));
				
				int cnt = pstmt.executeUpdate();
				
				System.out.println(cnt + " 개 레코드 입력 성공");
				
			}
	}
	@RequestMapping("sub02")
	public void method2() throws Exception {
		String sql = "INSERT INTO myTable08 (name, age, score, address, birthDate, inserted) VALUES (?,?,?,?,?,?)";
		
		try(Connection con = dataSourse.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			
			pstmt.setString(1, "Park ji sung");
			pstmt.setInt(2, 30);
			pstmt.setDouble(3, 99.99);
			pstmt.setString(4, "Seoul");
			pstmt.setDate(5, java.sql.Date.valueOf("2022-10-21"));
			pstmt.setTimestamp(6, java.sql.Timestamp.valueOf("2022-10-21 11:27:00"));
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(cnt + " 개 입력됨");
		}
	}
	@RequestMapping("sub03")
	public void method3() throws SQLException {
		String sql = "SELECT col1, col2, col3, col4, col5, col6 FROM myTable07";
		
		try(Connection con = dataSourse.getConnection();
				Statement stmt=con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
			
			while(rs.next()) {
				int col1=rs.getInt("col1");
				double col2 = rs.getDouble("col2");
				String col3 = rs.getString("col3");
				String col4 = rs.getString("col4");
				java.sql.Date col5=rs.getDate("col5");
				java.sql.Timestamp col6= rs.getTimestamp("col6");
				
				System.out.println(col1);
				System.out.println(col2);
				System.out.println(col3);
				System.out.println(col4);
				System.out.println(col5);
				System.out.println(col6);
				}
		}
		
	}
	
	@RequestMapping("sub04")
	public void method4() throws Exception {
		String sql = "SELECT * FROM myTable08";
		
		try(Connection con = dataSourse.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
			
			while(rs.next()) {
				String col1 = rs.getString("name");
				int col2 = rs.getInt("age");
				double col3 = rs.getDouble("score");
				String col4 = rs.getString("address");
				java.sql.Date col5 = rs.getDate("birthDate");
				java.sql.Timestamp col6 = rs.getTimestamp("inserted");
			
				System.out.println(col1);
				System.out.println(col2);
				System.out.println(col3);
				System.out.println(col4);
				System.out.println(col5);
				System.out.println(col6);
				
				
			}
		}
		
	}
	
	
}
