/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210325.ch9_3.exception2;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.io.IOException;
import java.util.NoSuchElementException;
/**
 *
 * @author xvpow
 */
public class TestException {
    //必要例外檢測
    //強制處理
    //throws 可能有什麼例外拋出
    public void testCheckdException(boolean isThrow)
	    throws FileNotFoundException{
	
	if (isThrow){
	    throw new FileNotFoundException("CheckdException");
	}	
    }
    
    public void testCheckdException2(int v)
	    throws FileNotFoundException,SQLException{
	switch(v){
	    case 1:
		throw new FileNotFoundException("testCheckdException2");
	    case 2:
	         throw new SQLException("testCheckdException2");	    
	}
    }
    
    public void testCheckedException3(int v)throws IOException,SQLException{
	switch(v){
	    case 1:
		throw new IOException("testCheckedException3");
	    case 2:
		throw new FileNotFoundException("testCheckedException3");
	    case 3:
		throw  new SQLException("testCheckedException3");
	}
    }
    
    public void testunCheckException(boolean t)throws NoSuchElementException {
	if (t){
	    throw new  NoSuchElementException();
	}
    }
}
