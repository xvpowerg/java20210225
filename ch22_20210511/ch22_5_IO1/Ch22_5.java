/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch22_20210511.ch22_5_IO1;
import java.io.File;
import java.io.IOException;
public class Ch22_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	File file = new File("c:\\mydir\\tmp.txt");
	System.out.println(file.exists());
	if (!file.exists()){
	    try{
		file.createNewFile();			
	    }catch(IOException ex){
		System.out.println(ex);
	    }	    
	}
	file.delete();
    }
    
}
