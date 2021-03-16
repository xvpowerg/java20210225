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
public class Ch6_3 {
    /*
    一模一樣類型
    相同類型可相容
    不同類型可相容
    封箱類型    
    */    
    //  一模一樣類型
    static void test1(int v1){
	System.out.println("int v1");
    }
    static void test1(float v1){
	System.out.println("float v1");
    }
    // 相同類型可相容
    static void test2(float v1){
	System.out.println("test2 float v1");
    }    
   static void test2(String v2){
	System.out.println("test2 String v2");
    }
       static void test2(long v3){
	System.out.println("test2 long v3");
    }    
       // 不同類型可相容
       static void test3(short s1){
	   System.out.println("Test3 s1");
       }
       static void test3(float f){
	   System.out.println("Test3 f");
       }
       
       static void test4(byte b1){
	   System.out.println("byte B1");
       }
       static void test4(Integer i2){
	   System.out.println("Integer i2");
       }
       
      static void test5(byte b1){
	   System.out.println("byte B1");
       }
       static void test5(Float i2){
	   System.out.println("Float i2");
       }
       
       
    public static void main(String[] args) {
	// TODO code application logic here
	test1(20);
	test2(51);
	test3(26);
	test4(82);
	//編譯錯誤 因為70會轉換為Integer　但是方法沒有Integer類型所以編譯錯誤
	//test5(70);
	
    }
    
}
