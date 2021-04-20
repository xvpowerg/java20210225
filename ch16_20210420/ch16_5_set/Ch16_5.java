/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210420.ch16_5_set;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author xvpow
 */
public class Ch16_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	HashSet<String> set = new HashSet<>();
	set.add("Ken");
	set.add("Vivin");
	set.add("Any");
	set.add("Vivin");
	
	set.forEach(System.out::println);
	
	
    }
    
}
