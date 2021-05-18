/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20210518.ch24_2_serialize1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
public class Ch24_3 {
//反序列化   
    public static void main(String[] args) {
	File file = new File("C:\\mydir\\myobj.obj");
        try(FileInputStream fin = new FileInputStream(file);
	   ObjectInputStream objin = new  ObjectInputStream(fin)){
	     List<String> list = (ArrayList)objin.readObject();
	     System.out.println(list);
	}catch(IOException | ClassNotFoundException ex){//能使用| catch 例外 不可父子關係
	    System.out.println(ex);
	}
    }
    
}
