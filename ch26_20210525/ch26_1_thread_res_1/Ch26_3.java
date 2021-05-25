/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210525.ch26_1_thread_res_1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author xvpow
 */
public class Ch26_3 {

 static class Test{
	    //執行緒不安全
	    //synchronized 同步化
	    //synchronized 等同於加一把鎖
	    //誰先搶到Key 誰就執行plusX
	    int x =0;
	    public synchronized void plusX(){		
		for (int i = 1;i<=10;i++){
		    System.out.println("Start.."+Thread.currentThread().getName());
		    System.out.println(x);
		    x++;
		   System.out.println("End.."+Thread.currentThread().getName()); 
		}
	    }
	    public  void plusX2(){		
		for(int i =1;i<=20;i++){
		     System.out.println("out Start.."+Thread.currentThread().getName());
		    System.out.println(i);
		    System.out.println("out End.."+Thread.currentThread().getName());
		}
		//this表示拿當前物件作為鎖
		//只有這個區塊需要非同步
		synchronized(this){
			for (int i = 1;i<=10;i++){
			    System.out.println("Start.."+Thread.currentThread().getName());
			    System.out.println(x);
			    x++;
			   System.out.println("End.."+Thread.currentThread().getName()); 
			}    
		}
		
	    }
	    
	}
    
    public static void main(String[] args) {
	
	Test obj = new Test();
//	Thread th1 = new Thread(()->{
//	   obj.plusX();	
//	},"Thread1");
//	Thread th2 = new Thread(()->{
//	obj.plusX();	
//	},"Thread2");	
//	th1.start();
//	th2.start();
//	
	
	Thread th3 = new Thread(()->{
	   obj.plusX2();	
	},"Thread3");
	Thread th4 = new Thread(()->{
	obj.plusX2();	
	},"Thread4");	
	th3.start();
	th4.start();
	
	
    }
    
    
}
