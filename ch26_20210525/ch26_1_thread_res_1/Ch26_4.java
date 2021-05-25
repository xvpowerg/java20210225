/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210525.ch26_1_thread_res_1;

/**
 *
 * @author xvpow
 */
public class Ch26_4 {

    static class TestLock{
	public synchronized void run1(TestLock lock,String msg){
	 System.out.println("run1");
	    lock.run2(msg);
	}
	public synchronized void run2(String msg){
	   System.out.println(msg);
	}
    }
    
    
    public static void main(String[] args) {
	// TODO code application logic here
	TestLock tlock1= new TestLock();
	TestLock tlock2= new TestLock();
	Thread th1 = new Thread(()->{
		tlock1.run1(tlock2, "test1");
	});
	Thread th2 = new Thread(()->{
		tlock2.run1(tlock1, "test2");
	});
	th1.start();
	th2.start();
	
	
    }
    
}
