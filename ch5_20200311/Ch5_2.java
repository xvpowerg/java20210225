/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_20200311;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {
    //變數放到函數內 會被改變嗎?
    //基本型態一定不會改變
    static void swap(int a,int b){
	int tmp = a;
	a = b;
	b = tmp;
    }
    //參考型態可能會改變
    static void swapArray(int[] array){
	int tmp = array[0];
	array[0] = array[1];
	array[1] = tmp;
    }
    
    
    public static void main(String[] args) {
	/*int a = 10,b = 2;
	System.out.println(a+":"+b);
	swap(a,b);
	System.out.println(a+":"+b);*/
	//陣列的交換
	int[] array = {5,7};
	System.out.println(array[0]+":"+array[1]);
	swapArray(array);
	System.out.println(array[0]+":"+array[1]);
	
	 
    }
    
}
