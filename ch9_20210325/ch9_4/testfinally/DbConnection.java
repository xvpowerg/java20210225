/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210325.ch9_4.testfinally;
import  java.util.Random;
/**
 *
 * @author xvpow
 */
public class DbConnection {
    private int number = -1;
    public boolean connection(boolean test){	
	if (number == -1){
	    Random ran = new Random();
	    number = ran.nextInt(1000000)+1;
	}
	if (test){
	    throw new RuntimeException("Connection Exception");
	}
	return number  > 0;		
    }
    public void close(){
	number = -1;
    }
    public void print(){
	System.out.println("Number:"+number);	
    }
}
