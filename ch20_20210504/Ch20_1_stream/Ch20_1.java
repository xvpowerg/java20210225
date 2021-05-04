/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210504.Ch20_1_stream;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.IntStream;
/**
 *
 * @author xvpow
 */
public class Ch20_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// Stream 流
	//1 幫助開發人員更清楚了解程式碼的動作
	//2 更快速的將程式變為多核心
	// Stream分類
	// 1 物件型的 名稱 Stream
	// 2 基本型態 名稱 IntStream LongStream DoubleStream 效能佳
	
	Stream<String> s1 =  Stream.of("Ken","Vivin","Lindy","Joy");
       s1.forEach(v->System.out.print(v+" ")); 
       //無限次數
       Stream<Item> s2 =  Stream.generate(Item::createItem);       
       s2.limit(5).forEach(v->System.out.println(v));
       
       IntStream is1 = IntStream.iterate(1, v->v+1);
       is1.limit(5).forEach(v->System.out.println(v));
       
    }
    
}
