/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210525.ch26_5_thread_tooks;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Ch26_5 {
    public static void main(String[] args) {
	//如果無舊Thread會產生新Thread 如果有舊的 使用Thread
     ExecutorService ex = Executors.newCachedThreadPool();
     for (int i=1;i<=100;i++){
	ex.execute(()->{
	    System.out.println(Thread.currentThread().getName());
	}); 
     }
     ex.shutdown();//等工作完成停止
     //ex.shutdownNow();//立刻停止
     
     
     
	
	
    }
    
}
