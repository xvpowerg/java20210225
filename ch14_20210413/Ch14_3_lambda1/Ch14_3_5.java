/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210413.Ch14_3_lambda1;
import java.util.function.BiFunction;
/**
 *
 * @author xvpow
 */
public class Ch14_3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	BiFunction<Integer,Float,String> f1 = (Integer i,Float f)->{
						return i+":"+f;};
	System.out.println(f1.apply(20, 15.6f));
	//不可移除()
	//不可加單邊類型
	BiFunction<Integer,Float,String> f2 =(i,f)->i+":"+f;
	System.out.println(f2.apply(31, 18.7f));
    }
    
}
