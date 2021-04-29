/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210429.Ch19_5_generic;
import java.util.ArrayList;
import java.util.List;
public class Ch19_5 {

    
    static void test1(List<Test1> list){
    }
    //泛型必須是 Test2 或 Test2的子類型
    static void test2(List<? extends Test2>list){
	//可輪巡 取出的類型為? extends後的類型
	list.forEach(v->System.out.println(v));
	Test2 t = list.get(0);
	//不可新增
	//list.add(new Test2());
    }
    //Test3 的父類型 可做為傳入List的泛型
   static void test3(List<? super Test3> list){
       //可取值 類型固定object
       Object t3 = list.get(0);
       // 可以新增 類型跟 ? super後一樣
       list.add(new Test3());
   }
    
    public static void main(String[] args) {
	// TODO code application logic here	
	//後面List的泛型 可以跟前面一樣 或使用<>	
	ArrayList<Test1> list = new ArrayList<>();
	ArrayList<Test2> list2 = new ArrayList<>();
	//test1(list2);//錯誤 因為<>類型是Test2
	ArrayList<Test1> list3 = new ArrayList<>();
	test1(list3);
	
	ArrayList<Test2> list4= new ArrayList<>();
	Test2 t1 = new Test2();
	Test2 t2 = new Test2();
	list4.add(t1);
	list4.add(t2);
	 //泛型必須是 Test2 或 Test2的子類型
	test2(list4);
	
	ArrayList<Test4> list5= new ArrayList<>();
	//Test3 的父類型 可做為傳入List的泛型
	test3(list);//Test1是Test3的父類
	test3(list2);//Test2是Test3的父類
	//因為Test4不是Test3的父類別 所以錯誤
	//test3(list5);
	
    }
    
}
