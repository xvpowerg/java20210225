/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20210518.ch24_2_serialize1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
public class Ch24_2 {

    //序列化  物件變檔案(可以是雲端)
    
    //反序列化 檔案變物件
    
    public static void main(String[] args) {
	File file = new File("C:\\mydir\\myobj.obj");
	List<String> list = new ArrayList();
	list.add("雞蛋");
	list.add("菠菜");
	list.add("豆腐");
	
	try(FileOutputStream fout = new FileOutputStream(file);
	   ObjectOutputStream objOut = new ObjectOutputStream(fout)){	    
	    objOut.writeObject(list);	    
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
    }
    
}
