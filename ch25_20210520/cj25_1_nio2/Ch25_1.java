/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch25_20210520.cj25_1_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch25_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Path path1 = Paths.get("C:", "mydir","sub1","dir");
	Path path2 = Paths.get("music","play.mp3");	
	Path p3 = path1.resolve(path2);
	System.out.println(p3);
	Path p4 = path1.resolveSibling(path2);
	System.out.println(p4);
	
	Path path5 = Paths.get("C:", "mydir","sub1","dir");
	Path path6 = Paths.get("D:","music","play.mp3");	
	//右邊有root會取代左邊
	Path path7 =  path5.resolve(path6);
	System.out.println(path7);
	
	Path path8 = Paths.get("C:", "mydir","sub1","dir");
	Path path9 = Paths.get("C:", "mydir");
	//path8 表示目前位置
	//path9 表示要到達的位置
	//可產生相對路徑 
	//產生相對路徑 只能是相同root
	Path path10 = path8.relativize(path9);
	System.out.println(path10);
	
    }
    
}
