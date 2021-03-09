/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210309;

/**
 *
 * @author xvpow
 */
public class Ch4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//二維陣列 
	//new int[3][2] 我有一個一維陣列
	// 長度為3 每個格子放
	//長度為2的一維陣列
	//類型是int
	int[][] array3x2= new int[3][2]; 
	array3x2[0][0] = 32;
	array3x2[2][0] = 82;
	array3x2[1][1] = 18;
	array3x2[2][1] = 96;
	for (int r=0;r < array3x2.length;r++){
	    for(int c=0;c < array3x2[r].length; c++){
		System.out.print(array3x2[r][c]+" ");
	    }
	    System.out.println();
	}
	//ForEach	
	for(int[]tmpArray : array3x2){
	    for (int v : tmpArray){
		System.out.print(v+" ");
	    }
	    System.out.println();
	}
	
    }
    
}
