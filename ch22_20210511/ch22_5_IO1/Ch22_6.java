/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210511.ch22_5_IO1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch22_6 {

    public static void main(String[] args) {
	File srcFile = new File("c:\\mydir\\myfile.txt");
	File targetFile = new File("c:\\mydir\\copy_myfile.txt");
	try {
	    FileInputStream fin = new FileInputStream(srcFile);
	    FileOutputStream otPut = new FileOutputStream(targetFile);
	    //因-1表示沒資料可讀
	    int data = -1;
	    while ((data = fin.read()) != -1) {
		//System.out.println(data);
		otPut.write(data);
	    }
	} catch (FileNotFoundException ex) {
	    System.out.println(ex);
	} catch (IOException ex) {
	    System.out.println(ex);
	}

    }

}
