/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210525.ch26_1_thread_res_1;
//CopyOnWriteArrayList支持執行續的List 執行緒安全
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 *
 * @author xvpow
 */
public class Ch26_1 {
	static class Test{
	    //執行緒不安全
	    //synchronized 同步化
	    //synchronized 等同於加一把鎖
	    //誰先搶到Key 誰就執行plusX
	    int x =0;
	    public  void plusX(){		
		for (int i = 1;i<=10;i++){
		    System.out.println("Start.."+Thread.currentThread().getName());
		    System.out.println(x);
		    x++;
		   System.out.println("End.."+Thread.currentThread().getName()); 
		}
	    }
	}
    
    public static void main(String[] args) {
	List list = new CopyOnWriteArrayList();
	
	Test obj = new Test();
	Thread th1 = new Thread(()->{
	   obj.plusX();
	   list.add(10);
	},"Thread1");
	Thread th2 = new Thread(()->{
	obj.plusX();
	list.add(20);
	},"Thread2");
	
	Thread th3 = new Thread(()->{
	obj.plusX();
	list.forEach(v->System.out.println(v));
	},"Thread3");
	
	th1.start();
	th2.start();
	th3.start();

	
	
    }
    
}
