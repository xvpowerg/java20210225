/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210506.stream1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("Ken");
	list.add("Vivin");
	list.add("Lindy");
	list.add("Joy");
	list.add("Vivin");
	// distinct 過濾重複
	list.stream().distinct().forEach(v->System.out.println(v));
	System.out.println(list.size());
	Optional<String> optionMax = list.stream().max(Comparator.comparing(s->s));
	optionMax.ifPresent(v->System.out.println(v));
	System.out.println("===========================");
	//跳過前2位
	list.stream().skip(2).forEach(v->System.out.println(v));
	
    }
    
}
