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
public class Ch4_2 {

    public static void main(String[] args) {
	//左邊的[] 數量等於右邊的[]數量就對
	int[][] arra1 = new int[2][3];
	int[] array2[] = new int[2][3];
	int array3[][] = new int[2][3];
	int array4[][] = {{5,6,9},
			   {7,8}};
	int array5[][] = new int[][]{{11,12,13,15},
				     {16,20}};
	
	int[][] array6 = new int[3][];
	array6[0] = new int[2];
	array6[1] = new int[]{15,32,70};
	array6[2] = new int[]{81};
	  for(int[] a1 : array6){
	      for (int v : a1){
		  System.out.print(v+" ");
	      }
	      System.out.println();
	  }
	
	
    }
    
}
