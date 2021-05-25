/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210525.ch26_5_thread_tooks;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Ch26_6 {
    static int x=1;
    public static void main(String[] args) {
	//固定的執行序數量
	ExecutorService es = Executors.newFixedThreadPool(4);
	for (int i = 1;i<=30;i++,x++){
	    es.submit(()->{
		System.out.println(x+":"+Thread.currentThread().getName());
		System.out.println("==================");
	    try{Thread.sleep(5000);}catch(InterruptedException ex){}		    
	    });    
	}
	
	
    }
    
}
