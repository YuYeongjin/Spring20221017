package org.zerock.controller.lecture.p06jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

@Controller
@RequestMapping("ex27")
public class Controller27 {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("sub01")
    public void method1() throws Exception{
        String sql1 = "UPDATE Bank SET balance = balance +100 WHERE customerID=1" ;
        String sql2 = "UPDATE Bank SET balance = balance -100 WHERE customerID=2" ;

        try(Connection con = dataSource.getConnection()) {

            try {
                // autocommit : disabled
                con.setAutoCommit(false);

                Statement stmt1 = con.createStatement();
                stmt1.executeUpdate(sql1);

//                int a = 0 ;
//                int b= 3/a; // ArithmeticException;

                Statement stmt2 = con.createStatement();
                stmt2.executeUpdate(sql2);

                con.commit();
            } catch ( Exception e){
                con.rollback();
            }

        }
    }
    
    @GetMapping("sub02")
    public void method2(){
        
    }
    @PostMapping("sub02")
    public void method3(HttpServletRequest request) throws Exception{

        // jsp에서 받을 때 그냥 >> @RequestParam 쓰거나
        // 이름이 같으면 그냥 String fname, lname , int salary 받아서 써도 됌


        // Employee 테이블 INSERT 쿼리 실행
        // Salary 테이블 INSERT 쿼리 실행
        // 위 두 쿼리가 모두 실행되거나 모두 실패할 수 있는 코드
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String salaryStr = request.getParameter("salary");
        int salary = Integer.parseInt(salaryStr);

        String sql1= "INSERT INTO Employees(firstName, lastName) VALUES (?,?) ";
        String sql2= "INSERT INTO Salary (EmployeeID, Salary) VALUES (?,?)";

        try(Connection con = dataSource.getConnection();
            PreparedStatement pstmt1 = con.prepareStatement(sql1,PreparedStatement.RETURN_GENERATED_KEYS);
            PreparedStatement pstmt2 = con.prepareStatement(sql2)){

            try{
                con.setAutoCommit(false);
                pstmt1.setString(1,fname);
                pstmt1.setString(2,lname);
                if(fname.equals("")&&lname.equals("")) {
                    int a = 0; int b = 3/0;
                }
                pstmt1.executeUpdate();
                ResultSet rs = pstmt1.getGeneratedKeys();
                if(rs.next()){
                    int newKey = rs.getInt(1);
                    pstmt2.setInt(1,newKey);
                    pstmt2.setInt(2,salary);
                    pstmt2.executeUpdate();
                }
                con.commit();
            } catch (Exception e){
                con.rollback();
            }
        }
    }
}
