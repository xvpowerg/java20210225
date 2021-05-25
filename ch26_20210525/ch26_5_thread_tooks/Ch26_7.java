/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch26_20210525.ch26_5_thread_tooks;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
public class Ch26_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	ExecutorService es = Executors.newFixedThreadPool(4);
	//callable 可回傳數值
	Future<Integer>future = es.submit(()->{
	    System.out.println("計算中....");
	    TimeUnit.SECONDS.sleep(5);
	    System.out.println("計算完成....");
	return ThreadLocalRandom.current().nextInt(10000);	
	});
	
	System.out.println("get Before");
	es.execute(()->{
		try{
		    //會等待完成
		   int result = future.get();
		   System.out.println(result);
		}catch(Exception ex){
		   System.out.println(ex);
		}	
	});

	
	System.out.println("get After");
	es.shutdown();
    }
    
}
