/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210525.ch26_1_thread_res_1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Ch26_2 {
    public static void main(String[] args) {
	//CopyOnWriteArrayList 執行續安全
	// ArrayList 執行續不安全
	List list = new CopyOnWriteArrayList();
	Thread th1 = new Thread(()->{
	    for(int i = 1;i<=1000;i++){
		list.add(10);	
	    }
	   
	},"Thread1");
	Thread th2 = new Thread(()->{
	for(int i = 1;i<=1000;i++){
		list.add(20);	
	    }
	},"Thread2");
	
	Thread th3 = new Thread(()->{	
	list.forEach(v->System.out.println(v));
	},"Thread3");
	
	th1.start();
	th2.start();
	th3.start();
    }
    
}
