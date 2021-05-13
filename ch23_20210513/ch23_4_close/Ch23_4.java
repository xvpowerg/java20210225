/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch23_20210513.ch23_4_close;

/**
 *
 * @author xvpow
 */
public class Ch23_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //關閉順序是倒順
       /*try(TestClose tc1 = new TestClose("TestClose1");
          TestClose tc2 = new TestClose("TestClose2");){
	   //在try()內的變數 還可以變動數值嗎?
	   //不可變動
	   //tc1 = null;	   	   
	  System.out.println("Body!!");	   
       }catch(Exception ex){
	   System.out.println(ex);
       }*/
       
       /*
        Body
	close:TestClole2
	close:TestClole1
	Exception:java.lang.Exception: Test Close Ex
	finally!!
       */
      /* try(TestClose tc1 = new TestClose("TestClole1");
	   TestClose tc2 = new TestClose("TestClole2")){
	   System.out.println("Body");
	   throw new Exception("Test Close Ex");
       }catch(Exception ex){
	System.out.println("Exception:"+ex);
       }finally{
	System.out.println("finally!!");
    }*/
      //第一個發生的例外會放在表面
      //其他的例外 會被Suppress(抑制)
      try(TestCloseTE close1 = new TestCloseTE("Test1");
	  TestCloseTE close2 = new TestCloseTE("Test2");){
	  System.out.println("Body!");	 
	  throw new Exception("Body Ex !!");
      }catch(Exception ex){
	  Throwable[] ths= ex.getSuppressed();
	  for (Throwable th : ths){
	     System.out.println(th);
	  }
	  System.out.println(ex);
      }finally{
	System.out.println("finally");
    }
      
      
       
       
       
    }
    
}
