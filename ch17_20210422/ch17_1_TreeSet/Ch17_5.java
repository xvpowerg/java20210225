/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210422.ch17_1_TreeSet;

import java.util.TreeSet;
import tw.com.test.Person;
import java.util.Comparator;

/**
 *
 * @author xvpow
 */
public class Ch17_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Person p1 = new Person("Ken",2500,20);
	Person p2 = new Person("Vivin",2500,30);
	Person p3 = new Person("Iris",2500,20);
	Person p4 = new Person("Lindy",3500,38);
	Comparator<Person> cmp =  Comparator.
				<Person,Integer>comparing(p->p.getSalary());
	cmp = cmp.thenComparing(p->p.getAge()).thenComparing(p->p.getName());
	//大到小
	cmp = cmp.reversed();
	TreeSet<Person> set = new TreeSet<>(cmp);
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	set.forEach(System.out::println);
    }
    
}
