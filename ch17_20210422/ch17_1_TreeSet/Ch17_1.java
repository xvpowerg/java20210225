/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210422.ch17_1_TreeSet;
import java.util.TreeSet;

/**
 *
 * @author xvpow
 */
public class Ch17_1 {

    public static void main(String[] args) {
	
	TreeSet<Integer> set = new TreeSet<>();
	set.add(10);
	set.add(5);
	set.add(16);
	set.add(2);
	set.add(11);
	for (int v : set){
	    System.out.println(v);
	}
	System.out.println("======================");
	System.out.println(set.first());
	System.out.println(set.last());
	System.out.println("======================");
	int lowerA = set.lower(9);
	int floorA = set.floor(9);
	System.out.println(lowerA);
	System.out.println(floorA);
	int lowerB = set.lower(5);//<
	int floorB = set.floor(5);//<=
	System.out.println("======================");
	System.out.println(lowerB);
	System.out.println(floorB);
	
	int higherA = set.higher(8);
	int ceilingA = set.ceiling(8);
	System.out.println(higherA);
	System.out.println(ceilingA);
	int higherB = set.higher(11);//>11
	int ceilingB = set.ceiling(11);//>=11
	System.out.println(higherB);
	System.out.println(ceilingB);
	
    }
    
}
