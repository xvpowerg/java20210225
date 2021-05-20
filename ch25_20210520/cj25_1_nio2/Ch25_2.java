/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch25_20210520.cj25_1_nio2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
/**
 *
 * @author xvpow
 */
public class Ch25_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Path path1 = Paths.get("C:", "mydir","test.zip");
	Path path2 = Paths.get("C:", "mydir","test_copy.zip");
	try{
	    //ATOMIC_MOVE 不可用於copy
	   Path path =  Files.copy(path1, path2,
		   StandardCopyOption.REPLACE_EXISTING);
	   System.out.println(path);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
    }
    
}
