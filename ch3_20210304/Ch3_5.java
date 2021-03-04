/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210304;
import java.util.Arrays;
public class Ch3_5 {
    public static void main(String[] args) {
	// TODO code application logic here
	int[] array = {8,6,19,13,15};
	Arrays.sort(array);
	//6 8 13 15 19
	int index = Arrays.binarySearch(array, 13);
	System.out.println(index);
	//找不到一定回傳負數
	//比所有都小 一律-1
	  int index2 = Arrays.binarySearch(array, 2);
	  System.out.println(index2);
	//比所有都大
	int index3 = Arrays.binarySearch(array, 100);
	System.out.println(index3);//(陣列長度 + 1) *-1
	//在中間
	int index4= Arrays.binarySearch(array,10 );
	System.out.println(index4);//-3 查找數值下一個的長度 *-1
	index4= Arrays.binarySearch(array,18 );
	System.out.println(index4);//-5
    }
    
}
