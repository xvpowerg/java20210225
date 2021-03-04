/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210304;
import java.util.Arrays;
import java.util.Comparator;
public class Ch3_4 {
    public static void main(String[] args) {
	
	int[] array = {8,10,2,51,20};
	//預設排序是小到大 ASC
	Arrays.sort(array);	
	for (int v: array){
	    System.out.print(v+ " ");
	}
	String[] names = new String[50000];
	//填滿
	Arrays.fill(names, "");
	if(names[0].equals("Ken")){
	    System.out.println("is Ken");
	}
	
	//Copy of Range
	int[] array2 = {81,72,63,54,85,16};	
	int s1 = 2;
	int s2 = 5;
	int[] copyArray2 =new int[s2-s1];
	for(int i=s1,k=0;i <s2;i++,k++){
	    copyArray2[k] = array2[i];
	}
	 System.out.println();
	for (int v : copyArray2){
	    System.out.println(v);
	}
	
	int[] newArray1 =  Arrays.copyOf(array2, 3);
	for (int v : newArray1){
	    System.out.print(v+ " ");
	}
	 System.out.println();
	int[] newArray2 = Arrays.copyOfRange(array2, s1, s2);
	for (int v : newArray2){
	    System.out.print(v+ " ");
	}
    }
    
}
