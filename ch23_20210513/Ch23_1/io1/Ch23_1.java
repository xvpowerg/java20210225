/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch23_20210513.Ch23_1.io1;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ch23_1 {

    public static void main(String[] args) {
	File src = new File("C:\\MyDir\\test.zip");    
	File target = new File("C:\\MyDir\\test_copy.zip");
	try{
	    InputStream input = new FileInputStream(src);
	    OutputStream output = new FileOutputStream(target);
	    byte[] buffer = new byte[1024*1204];
	    int index = -1;
	    while( (index = input.read(buffer)) != -1 ){
		output.write(buffer, 0, index);
	    }
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
    }
    
}
