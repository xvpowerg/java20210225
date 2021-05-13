/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch23_20210513.ch23_5_io2;
import java.io.IOException;
import java.io.File;
import java.io.Writer;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.stream.Collectors;

public class Ch23_6 {

    public static void main(String[] args) {
	File file  = new File("c:\\mydir\\msg_file.txt");
	
	try(FileWriter fw = new FileWriter(file);
	BufferedWriter buffw = new BufferedWriter(fw);	){	    	    
	    buffw.append("AAAA!!");
	    buffw.newLine();
	    buffw.append("BBBB!!");	    
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
	try(FileReader fr = new FileReader(file);
	    BufferedReader bfr = new BufferedReader(fr);){
	    //bfr.lines().forEach(v->System.out.println(v));
	   String v = 
		   bfr.lines().collect(Collectors.joining(",", "Title:", "."));
	   System.out.println(v);
	}catch(IOException ex){
	    System.out.println(ex);		   
	}
	
    }
    
}
