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
/**
 *
 * @author xvpow
 */
public class Ch25_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Path path1 = Paths.get("C:", "mydir","msg2.txt");
	
	try{
//	    List<String> list = Files.readAllLines(path1);
//	    list.forEach(v->System.out.println(v));
            int count = Files.lines(path1).mapToInt(s->s.length()).sum();
	    long lineCount = Files.lines(path1).count();
	    System.out.println(count);
	    System.out.println(lineCount);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	   
	
    }
    
}
