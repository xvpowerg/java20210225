/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch23_20210513.ch23_5_io2;
import java.io.File;	
import java.io.Reader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
/**
 *
 * @author xvpow
 */
public class Ch23_5 {
    public static void main(String[] args) {
	// TODO code application logic here
	File file  = new File("c:\\mydir\\msg.txt");
	/*try(FileReader fr = new FileReader(file);){
	    int data = -1;
	    while((data = fr.read()) != -1 ){
		    System.out.print((char)data);	
	    }	    
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}*/
	// MyFileReader 可以傳Charset  預設為utf-8
//	try(FileInputStream fin = new FileInputStream(file);
//	    InputStreamReader ir = new InputStreamReader(fin,Charset.forName("BIG5"));){
//		int data = -1;
//	    while((data = ir.read())!=-1 ){
//		System.out.print((char)data);
//	    }	    
//	}catch(IOException ex){
//	        System.out.println(ex);
//	}
     
        try(MyFileReader mfr = new MyFileReader(file,Charset.forName("Big5"))){
		int data = -1;
		while((data = mfr.read())!=-1 ){
		    System.out.print((char)data);
		}	    
	}catch(IOException ex){
	        System.out.println(ex);
	}
	
    }
    
}
