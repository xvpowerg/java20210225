/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210408.ch13_2functionIf2;
import java.util.function.Consumer;
class PrintMsgFunc1 implements Consumer<String> {
    public void accept(String msg){
	System.out.print(msg+" ");
    }
}
class PrintMsgFunc2 implements Consumer<String>{
	public void accept(String msg){
	    System.out.println(msg);
	}
}
public class Ch13_2 {
    //Consumer<T>void	accept(T t) 消費者 用於接收
    public static void main(String[] args) {
	//Consumer<T>void	accept(T t) 消費者 用於接收
	//Supplier<T>T	get()  用於提供
	
	//Function<T,R> R	apply(T t) 轉換
	//UnaryOperator<T>  T	apply(T t) 取代 累加 一元運算
	
	//Predicate<T>  boolean	test(T t) 用於驗證
	
	TestConsumer tc = new TestConsumer();
	int type = 2;
	Consumer<String> printFunc = new PrintMsgFunc1();
	if (type == 2){
	    printFunc = new PrintMsgFunc2();
	}
	//PrintMsgFunc1
	//PrintMsgFunc2
	tc.printMsg(printFunc);
    }
    
}
