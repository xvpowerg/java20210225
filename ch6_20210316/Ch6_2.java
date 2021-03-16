/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210316;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {
    //多載 
    //方法名稱相同
    //參數的類型或數量不一樣
    static void test1(int v){
	System.out.println("int:"+v);
    }
    static void test1(float f){
	System.out.println("float:"+f);	
    }
    
    static int test2(int x,int y){
	  return x +y;
    }
    
    static float test2(float f1,float f2){
	return f1 + f2;
    }
    public static void main(String[] args) {
	//多載
	test1(12.5f);
	test1(20);
	
	int v1 = test2(2,5);
	int v2 =test2(2,5);
	test2(2,5);
	test2(2,5);
	test2(2,5);
	
	
	
    }
    
}
