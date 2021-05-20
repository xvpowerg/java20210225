/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch25_20210520.cj25_6_thread1;

/**
 *
 * @author xvpow
 */
public class Ch25_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	    //Thread 單一核心內做很多的事
	    //Thread 一個人
	System.out.println(Thread.currentThread().getName());
	System.out.println("Start!!");
	
	Thread th1 = new Thread(){
	    //Thread會自動運行run
	    public void run(){
		//模擬很慢的事
		try{
		    System.out.println("做事!!"+Thread.currentThread().getName());
		Thread.sleep(5000);
		System.out.println("完成!!");
		}catch(InterruptedException ex){}
	  }
	
	};
	
	th1.start();
	
	System.out.println("End!!!");
    }
    
}
