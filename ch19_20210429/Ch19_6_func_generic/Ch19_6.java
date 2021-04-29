/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210429.Ch19_6_func_generic;

/**
 *
 * @author xvpow
 */
public class Ch19_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	 Test1 t1 = new Test1();
	 //可動判定類型 因為第一個參數的類型是字串 所以回傳字串
	 String v = t1.func1("Test",
		 s->{return s+":value1";});
	 System.out.println(v);
	 int v2 = t1.func1(10,
		 s->{return s+20;});
	 System.out.println(v2);
    }
    
}
