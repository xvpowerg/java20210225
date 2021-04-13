/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210413.Ch14_3_lambda1;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch14_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//lambda語法
	//完整版
	Consumer<Integer> c1=(Integer value)->{
	    System.out.println(value);
	} ;
	c1.accept(10);
	//簡易版1 類型可不加
	Consumer<Integer> c2=(value)->{
		System.out.println(value);
	};
	c2.accept(25);
	//簡易版2 類型不加 參數只有一個 小括號也可不加	
	Consumer<Integer> c3=value->{
		System.out.println(value);
	};
	c3.accept(30);
	//簡易版3 如果功能只有一條命令 {}也可去除
	Consumer<Integer> c4 = 
		 value->System.out.println(value);
	c4.accept(90);
	
    }
    
}
