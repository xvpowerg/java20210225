/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210525.ch26_8_jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch26_8 {

    public static void main(String[] args) {
	String url = "jdbc:derby://localhost:1527/mydb20210525";
	try(Connection conn = DriverManager.getConnection(url, "qwer", "123456");){
	    Statement st = conn.createStatement();
	  int count =   st.executeUpdate("INSERT INTO student(id,name,score) VALUES(1001,'Vivin',85.6)");
	    if (count > 0){
		System.out.println("成功!");
	    }
	   ResultSet resultSet = st.executeQuery("SELECT * FROM student");
	   while(resultSet.next()){
	       //記得index是1
	       int id = resultSet.getInt(1);
	       String name = resultSet.getString("name");
	       float score = resultSet.getFloat(3);
	       System.out.println(id+":"+name+":"+score);
	   }
	}catch(SQLException ex){
	    System.out.println(ex);
	}
       
    }
    
}
