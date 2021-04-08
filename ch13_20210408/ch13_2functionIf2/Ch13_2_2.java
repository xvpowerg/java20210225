/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210408.ch13_2functionIf2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;
import java.util.Random;
import java.util.function.Supplier;


class ListSupplier implements Supplier<Collection<Integer>>{
	public Collection<Integer> get(){
	    return new ArrayList<Integer>();
	}
}
class SetSupplier implements Supplier<Collection<Integer>>{
	public Collection<Integer> get(){
	    return new HashSet<Integer>();
	}
}
public class Ch13_2_2 {

    
    static Collection<Integer> getRandomCollection(int count,
	    Supplier<Collection<Integer>> collSup){
	if (count <=0 || collSup == null ) throw new  IllegalArgumentException();
	Collection<Integer> coll = collSup.get();
	Random ran = new Random();
	for (int i =1;i <= count;i++){
	    int v = ran.nextInt(count)+1;    
	    coll.add(v);	     
	}	
	return coll;
    }
    public static void main(String[] args) {
	Supplier<Collection<Integer>> supp = new ListSupplier();
	Collection<Integer> c1 = getRandomCollection(10,supp);
	Supplier<Collection<Integer>> supp2 = new SetSupplier();
	Collection<Integer> c2 =  getRandomCollection(10,supp2);
	
	for (int v : c1){
	    System.out.print(v+" ");
	}
	
	System.out.println();
	System.out.println("=========================");
	
       for (int v : c2){
	    System.out.print(v+" ");
	}
	
    }
    
}
