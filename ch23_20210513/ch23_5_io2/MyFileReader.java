/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch23_20210513.ch23_5_io2;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
/**
 *
 * @author xvpow
 */
public class MyFileReader  extends InputStreamReader{
    
    public MyFileReader(File file)
	    throws FileNotFoundException{
	this(file,Charset.forName("UTF-8"));
    }
    
    public MyFileReader(File file,Charset chatset)
	    throws FileNotFoundException{
         super(new FileInputStream(file),chatset);
    }
    
}

