/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210511.ch22_7_IO2;

import ch22_20210511.ch22_5_IO1.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch22_7 {

    public static void main(String[] args) {
	File srcFile = new File("c:\\mydir\\test.zip");
	File targetFile = new File("c:\\mydir\\copy_test.zip");	
	try {
	    InputStream fin = new FileInputStream(srcFile);
	    fin = new BufferedInputStream(fin);
	    OutputStream otPut = new FileOutputStream(targetFile);
	    otPut = new BufferedOutputStream(otPut);
	    //因-1表示沒資料可讀
	    int data = -1;
	    while ((data = fin.read()) != -1) {
		//System.out.println(data);
		otPut.write(data);
	    }
	    otPut.close();
	} catch (FileNotFoundException ex) {
	    System.out.println(ex);
	} catch (IOException ex) {
	    System.out.println(ex);
	}

    }

}
