/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20210225;

/**
 *
 * @author xvpow
 */
public class Ch1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	boolean b1 = true,b2 = false;
	System.out.println(b1 && b2);
	System.out.println(b1 || b2);
	System.out.println(b1 ^ b2);//一真一假為真
	System.out.println(!b1);
	
	//短路
	int g = 0;
	boolean b3 = g <1 && ++g >3;
	System.out.println(b3);
	System.out.println(g);
	//&& 左邊false 短路啟動 
	//最快判斷是否為false放在左邊
	//判斷是否為null放在左邊
	int y = 6;
	boolean b4 = y < 5 && ++y >7;
	System.out.println(b4);
	System.out.println(y);
	
	int k = 0;
	boolean b5 = k > 1 || ++k > 0;
	System.out.println(b5);
	System.out.println(k);
	
	//最快判斷是否為true放在左邊
	int x = 0;
	boolean b6 = x < 1 || ++x>0;
	System.out.println(b6);
	System.out.println(x);
	
	
    }
    
}
