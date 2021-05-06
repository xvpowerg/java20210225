/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210506.stream2;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch21_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	//預設值 累加計算(accumulator) 合併(combiner)
	//parallel 時
	//哪個元素先做計算不一定
	//accumulator 是拿 預設值 + 元素
	//combiner 真的做計算
	int v = list.stream().parallel().reduce(1, (v1,v2)->{
		System.out.println("accumulator:"+v1+":"+v2);
	    return v1+v2;
		},
		(m1,m2)->{
		    System.out.println("combiner:"+m1+":"+m2);
	       return m1+m2;
	       });
	System.out.println(v);
	
    }
    
}
