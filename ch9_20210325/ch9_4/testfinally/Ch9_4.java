/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210325.ch9_4.testfinally;

/**
 *
 * @author xvpow
 */
public class Ch9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	DbConnection dbc = new DbConnection();
	//只要離開try 就會執行finally
	try{
	    dbc.connection(true);	    
	}catch(RuntimeException ex){
	    System.out.println(ex);
	}finally{
	      dbc.close();
	}
	
	dbc.print();
	dbc.connection(false);
	dbc.print();
    }
    
}
