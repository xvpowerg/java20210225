/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210429.Ch19_3_generic;
import java.util.ArrayList;
public class Ch19_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	TestGeneric1<Object,ArrayList<Object>> tg1 = 
		new TestGeneric1();
	tg1.setList(new ArrayList());
	tg1.add("Test1");
	tg1.add(2);
	tg1.add("Test3");
	tg1.foeach(v->System.out.println(v));
	
	TestGeneric1<String,ArrayList<String>> 
		tg2 = new TestGeneric1();
	tg2.setList(new ArrayList<String>());
	tg2.add("Test1");		
	tg2.add("Test3");
	tg2.foeach(v->System.out.println(v));
	
    }
    
}
