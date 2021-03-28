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
public class Ch5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//封箱類型
	//封箱 基本形態轉為參考型態
	//基本型態  封箱
	//byte     Byte
	//short   Short
	//int     Integer
	//long    Long
	//float   Float
	//double  Double
	//char   Character
	//boolean Boolean
	
	//手動封箱
	Integer i1 = Integer.valueOf(10);
	//手動開箱
	int v1 = i1.intValue();
	System.out.println(v1);
	
	//自動封箱
	Integer i2 = 82;
	//自動開箱
	int v2 = i2;
	System.out.println(v2);
	
	int i3 = 20;
	double d3 = i3;
	
	int i4 = 60;
	 //因為i4類型為int java會嘗試轉為Integer 
	 //Double 不相容Integer所以會產生編譯錯誤
	//Double d4 = i4;
	
    }
    
}
