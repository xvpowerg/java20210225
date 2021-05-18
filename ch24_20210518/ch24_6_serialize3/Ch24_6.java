/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20210518.ch24_6_serialize3;

import ch24_20210518.ch24_4_serialize2.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author xvpow
 */
public class Ch24_6 {

    public static void main(String[] args) {
	// TODO code application logic here
	
	Order order = new Order(20,"Ken",850);
	File file = new File("C:\\mydir\\order.obj");
	try(FileOutputStream out = new FileOutputStream(file);
	    ObjectOutputStream oos = new ObjectOutputStream(out);){
	    oos.writeObject(order);
	}catch(IOException ex){
	    System.out.println(ex);
	}
    }
    
}
