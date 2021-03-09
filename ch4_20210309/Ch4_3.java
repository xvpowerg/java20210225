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
public class Ch4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	

	int[][] array2xN = new int[3][];
	array2xN[0] = new int[2];
	array2xN[2] = new int[5];
	array2xN[0][1] = 20;
	//array2xN[0][2] =15;// java.lang.ArrayIndexOutOfBoundsException
	//array2xN[1][0] =30;//java.lang.NullPointerException
    }
    
}
