/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210406.ch12_2_interface2;

/**
 *
 * @author xvpow
 */
//public class Gundam implements Attack,Fly,Jump,GundamSkill  {
 public class Gundam implements GundamSkill  {
    public void attacking(){
	System.out.println("光束武器");
    }
     public void flying(){
	 System.out.println("飛行動力");
     }
      public  void jumping(){
	  System.out.println("跳躍動力");
      }
}
