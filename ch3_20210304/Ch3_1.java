/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210304;
import java.util.stream.IntStream;

public class Ch3_1 {

    public static void main(String[] args) {
	int[] a1;
	//java new 會跟Heap要空間 
	a1 = new int[3];
	a1[0] = 51;
	a1[2] = 86;
	//1
	for(int i= 0;i<a1.length;i++){
	    System.out.println(a1[i]);
	}
	

	//2 foreach
	for (int v :a1){
	    System.out.println(v);
	}
	
	//3 Stream
	IntStream.of(a1).forEach(System.out::println);
    }
    
}
