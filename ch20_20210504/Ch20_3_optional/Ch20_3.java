/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210504.Ch20_3_optional;
import com.sun.istack.internal.NotNull;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.Optional;
public class Ch20_3 {
    
    static void checkName(String name){
	
	if (name.length() > 2){
	    System.out.println("Pass");	    
	}else{
	    System.out.println("Fail");	    
	}
    }
    
    static void checkName(Optional<String> name){	
	//因為有了Optional 可以使用Optional判斷null
	if (name.isPresent()){
	   String s  = name.get();    
	   checkName(s);
	}else{
	    System.out.println("Fail");	    
	}
	
//	if (name!=null && name.length() > 2){
//	    System.out.println("Pass");	    
//	}else{
//	    System.out.println("Fail");	    
//	}
    }
    public static void main(String[] args) {
	Stream<String> stream = Stream.of("Ken","Vivin","Lindy");
	Optional<String> option =   stream.findFirst();
	System.out.println(option.get());
	Student st1 = new Student("Ken",85);
	System.out.println(st1.getName()+":"+st1.getScore());
	checkName(st1.getName());	
	Student st2 = new Student(null,85);
	checkName(st2.getName());	
    }
    
}
