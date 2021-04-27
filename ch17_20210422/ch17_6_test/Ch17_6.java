/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210422.ch17_6_test;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch17_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Random rand = new Random();
	ArrayList<Integer> list = new ArrayList<>();	
	for (int i=1;i<=200;i++){
	    int n= rand.nextInt(300)+1;
	    list.add(n);    
	}
	
	
	
	List<TreeSet<Integer>> listSet = new ArrayList<>();
	listSet.add(new TreeSet());
	listSet.add(new TreeSet());
	listSet.add(new TreeSet());
	for (int v : list){
	    if (v <= 100){
		listSet.get(0).add(v);
	    }else if(v <=200){
		listSet.get(1).add(v);
	    }else{
	       listSet.get(2).add(v);
	    }
	}
	//分類 小於等於 100 排序不可重複分一類
	//分類 小於等於 200 排序不可重複分一類
	//分類 小於等於 300 排序不可重複分一類
	//放到一組List中
	//最後輸出 List中的每個分類的大小
	
	for (TreeSet set : listSet){
	    System.out.println(set.size());
	}
	
	
	
	
	
    }
    
}
