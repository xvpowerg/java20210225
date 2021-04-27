/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210422.ch17_7_comp;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch17_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	Test1 t1 = new Test1(10);
	Test1 t2 = new Test1(5);
	Test1 t3 = new Test1(8);
	Comparator<Test1> cmp = Comparator.<Test1,Item>comparing(t->t.getItem());
	TreeSet<Test1> set = new TreeSet<>(cmp);
	set.add(t1);
	set.add(t2);
	set.add(t3);
    }
}
