/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210422.ch17_1_TreeSet;
import java.util.TreeSet;
import tw.com.test.Person;
import java.util.Comparator;
public class Ch17_4 {
    static class MyPersonCmp implements Comparator<Person>{
	public int compare(Person p1,Person p2){
	    if (p1.getSalary() > p2.getSalary()){
		return 1;
	    }else if (p1.getSalary() < p2.getSalary()){
	    return -1;
	    }else if(p1.getAge() > p2.getAge()){
		return 1;
	    }else if(p1.getAge() < p2.getAge()){
		return -1;
	    }
	    return p1.getName().compareTo(p2.getName());
	}
    }
    
    public static void main(String[] args) {
	MyPersonCmp cmp = new MyPersonCmp();
	//年齡 姓名
	Person p1 = new Person("Ken",2500,20);
	Person p2 = new Person("Vivin",2500,30);
	Person p3 = new Person("Iris",2500,20);
	Person p4 = new Person("Lindy",3500,38);
	TreeSet<Person> set = new TreeSet<>(cmp);
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	set.forEach(System.out::println);
    }
    
}
