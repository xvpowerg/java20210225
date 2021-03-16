/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210316;
    /*
    一模一樣類型
    相同類型可相容
    不同類型可相容
    封箱類型    
    */    
public class Ch6_4 {

    static void test5(int a,float b){
	System.out.println("test5 int float");
    }
    static void test5(float a,short s){
	System.out.println("test5 float short");
    }
    
    static void test6(float a,int b){
	System.out.println("float int");
    }
    static void test6(int a,float b){
	System.out.println("int float");
    }
    
    static void test7(Integer a,int b){
	System.out.println("Integer int");
    }
     static void test7(float a,int b){
	System.out.println("float int");
    }
    
    public static void main(String[] args) {
	// TODO code application logic here
	test5(10,20);
	//test6(15,17);//模稜兩可會出錯
	test7(16,21);
    }
    
}
