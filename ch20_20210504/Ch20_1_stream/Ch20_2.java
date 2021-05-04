/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210504.Ch20_1_stream;
import java.util.stream.Stream;
import java.util.ArrayList;
public class Ch20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//Stream的特性
	//1 Stream不可重複使用
	//2 Stream 分 惰性 與 終端
	//3 Stream 不可修改性
	ArrayList<String> list = new ArrayList();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
 	Stream<String>s1 =  list.stream();
	//1 Stream不可重複使用
//	s1.forEach(System.out::println);
//	s1.forEach(System.out::println);
//count是終端的
//long count = list.stream().peek(v->System.out.println(v)).count();
//System.out.println(count);
//filter是惰性
    list.stream().peek(v->System.out.println(v)).filter(s->s.length() > 3);
	
    }
    
}
