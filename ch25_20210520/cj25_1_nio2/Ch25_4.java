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
import java.util.List;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch25_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here	
	Path p1 = Paths.get("C:", "mydir");
	try{
	    //list 只在某一層
	//Files.list(p1).forEach(p->System.out.println(p.getFileName()));    
	//Files.walk 連資料夾都會展開
	//預設展開到2147483647層
	//Files.walk 參數2可確定展開層數
	  Stream<Path> strPath =   Files.walk(p1,2);
	  strPath.forEach(p->System.out.println(p));	  
	}catch(IOException ex){
	    
	}
	
	
    }
    
}
