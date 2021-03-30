/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210330.override1_ex;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    //不拋
//    @Override
//    public void fun(){
//	
//    }
   //拋一樣
//    @Override
//    public void fun()throws IOException{
//	
//    }
    //拋子類
      @Override
    public void fun()throws FileNotFoundException{
	System.out.println("Test2");
    }
}
