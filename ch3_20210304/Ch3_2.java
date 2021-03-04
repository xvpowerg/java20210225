/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210304;

/**
 *
 * @author xvpow
 */
public class Ch3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	int[] array1 = new int[3];
	int array2[] = new int[4];
	//給陣列初始值
	int[] array3 = {5,8,2,9};
	//不可給長度
	int[] array4 = new int[]{2,6,9,1};
	
	int[]array5 ;
	//array5 = {1,2,3};
	array5 = new int[]{1,2,3};
	// 使用for將array3印出
	for(int i = 0;i <array3.length;i++){
	    System.out.print(i+":"+array3[i]+ " ");
	}
	System.out.println();
	// 使用foreach將 array5印出
	for(int x : array5){
	    System.out.print(x+" ");
	}
    }
    
}
