/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210506.stream1;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch21_3 {

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
	//map 　用於轉換資料
	list.stream().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
	long count = 
		list.stream().mapToInt(s->s.length()).filter(len->len > 3).count();
	System.out.println(count);
    }
    
}
