/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210413.Ch14_3_lambda1;
import java.util.function.Function;
public class Ch14_3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Function<Integer,String> f1 = (Integer v)->{return v+"";};
	System.out.println(f1.apply(52));	 
	Function<Integer,String> f2 = (v)->{return v+"";};
	System.out.println(f2.apply(61));
	Function<Integer,String> f3 = v-> "數字:"+v;
	System.out.println(f3.apply(82));
	
    }
    
}
