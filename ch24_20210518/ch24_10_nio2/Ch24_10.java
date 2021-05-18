/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20210518.ch24_10_nio2;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_10 {
    public static void main(String[] args) {
	//Path 沒有方法會改變自己
	Path path = Paths.get("C:", "mydir","A","B");
	Path path2 = Paths.get("dir", "mydir","A","B");
	System.out.println(path);
	System.out.println(path.getFileName());
	//記得getNameCount不算root 
	System.out.println(path.getNameCount());
	System.out.println(path.getRoot());
	System.out.println(path2.getRoot());
	//subpath 不包含root 下列案例是0~小於2的區間
	System.out.println(path.subpath(0, 2));
	System.out.println(path2.subpath(0, 2));
	//normalize 可將不必要的相對路徑移除
	Path path3 = Paths.get(".", "..","dir2","dir_2_2");
	System.out.println(path3.normalize());
	Path path4 = Paths.get(".", "..","dir2","..", "dir_2_2");
	System.out.println(path4.normalize());
    }
    
}

