/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210413.Ch14_3_lambda1;
import java.util.function.Consumer;
public class Ch14_3 {

    /**
     * Lambda 只能用於Functional Interface
     */
    static void testConsumer(Consumer<Integer>c,int... vargs){
	for (int v : vargs){
	    c.accept(v);
	}

    }
    public static void main(String[] args) {
	testConsumer(new Consumer<Integer>(){
		public void accept(Integer v){
		     System.out.println(v);
		}
	},5,6,7,8);
	//lambda語法
	testConsumer(x->System.out.println(x),
		4,5,6,7,8);
    }
    
}
