/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210422.ch17_1_TreeSet;
import tw.com.test.Person;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch17_3 {

  //可以用內部類 實作 java.lang.Comparable
    static class MyPerson extends Person implements Comparable<Person>{
	MyPerson(String name,int salary,int age){
	    super(name,salary,age);
	}
	public int compareTo(Person p){
	    if (this.getSalary()>p.getSalary()){
		return 1;
	    }else if(this.getSalary()<p.getSalary()){
		return -1;
	    }
	    return 0;
	}
    }
    public static void main(String[] args) {
	  Person p1 = new MyPerson("Ken",25000,25);
	  Person p2 = new MyPerson("Iris",35000,35);
	  Person p3 = new MyPerson("Vivin",85000,65);
	//  System.out.println(p1);
	  TreeSet<Person> set = new TreeSet<>();
	  set.add(p1);
	  set.add(p2);
	  set.add(p3);
	  set.forEach(System.out::println);
    }
    
}
