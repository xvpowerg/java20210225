/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210325.ch9_3.exception2;
import java.io.FileNotFoundException;
import java.io.IOException;
import  java.sql.SQLException;
import  java.util.NoSuchElementException;
/**
 *
 * @author xvpow
 */
public class Ch9_3 {

    /**
     * 例外分2類
     * 必要檢測   checked exceptions  直接繼承Exception
     * 非必要檢測 unchecked exceptions 繼承RuntimException
     */
    public static void main(String[] args) {
	TestException tex = new  TestException();
	//因為testCheckdException 可能會拋出 FileNotFoundException 
	//所以必須 再拋出 或是 try catch
	try{
	    tex.testCheckdException(true);    
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}
	
	try{
	    tex.testCheckdException2(2);
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(SQLException ex){
	    System.out.println(ex);
	}
	
	try{
	    tex.testCheckedException3(3);
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}catch(SQLException ex){
	    System.out.println(ex);
	}
	//非必要檢測
	try{
	    tex.testunCheckException(true);
	}catch(NoSuchElementException ex){
	     System.out.println(ex);
	}
	
	 
	//testCheckdException2(1); 拋出IOException
	//testCheckdException2(2); 拋出FileNotFoundException
	//testCheckdException2(3); 拋出SQLException
	
    }
    
}
