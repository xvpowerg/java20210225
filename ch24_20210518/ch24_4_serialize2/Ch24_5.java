/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20210518.ch24_4_serialize2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author xvpow
 */
public class Ch24_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	File file = new File("C:\\mydir\\order.obj");
	try(FileInputStream fin = new FileInputStream(file);
	    ObjectInputStream objIn = new ObjectInputStream(fin);){	    
	    Order order = (Order) objIn.readObject();
	    System.out.println(order);
	}catch(IOException | ClassNotFoundException ex){
	    System.out.println(ex);
	}
	
	
    }
    
}
