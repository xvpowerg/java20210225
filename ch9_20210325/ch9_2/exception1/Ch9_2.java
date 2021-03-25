/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210325.ch9_2.exception1;

/**
 *
 * @author xvpow
 */
public class Ch9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Employee emp = new Employee();
	try{
	    //一個檢測例外區塊
	  emp.setName("Ken");	
	  emp.setSalary(100000);
	  emp.print();
	//ex 例外發生時 會放置到ex
	}catch(IllegalArgumentException ex){
	    System.out.println(ex);
	}
	System.out.println("Test!!");
    }
    
}
