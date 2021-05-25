/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210525.ch26_8_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author xvpow
 */
public class Ch26_9 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
	String url = "jdbc:derby://localhost:1527/mydb20210525";
	try(Connection conn = DriverManager.getConnection(url, "qwer", "123456");){
	    conn.setAutoCommit(false);
	    //conn.setAutoCommit 開始 到commit 之間都是一筆交易
//	    //只要有任何一筆出錯都不可完成
	    Statement st = conn.createStatement();
	  st.executeUpdate("INSERT INTO student(id,name,score) VALUES(1005,'Tom',85)");
	  if(true)
	  throw new RuntimeException("Test!");
	  st.executeUpdate("INSERT INTO student(id,name,score) VALUES(1006,'Bob',92)");
	   conn.commit();
	   
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
