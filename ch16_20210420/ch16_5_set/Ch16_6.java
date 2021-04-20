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
public class Ch16_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Data d1 = new Data(100,"A");
	Data d2 = new Data(200,"B");
	Data d3 = new Data(500,"C");
	Data d4 = new Data(100,"A");
	//先比hashCode
	//在比equals
	
	Set<Data> set = new HashSet<>();
	set.add(d1);
	set.add(d2);
	set.add(d3);
	set.add(d4);
	set.forEach(System.out::println);
	System.out.println(d4.equals(d1));
    }
    
}

