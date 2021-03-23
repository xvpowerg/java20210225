/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210323.override;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    public void publicMethod(){
	System.out.println("T2 publicMethod!!");
    }
    //public protected
    @Override //檢查覆寫正確性
    public void testProtected(){
	System.out.println("T2 Protected!!");
    }
    @Override
    // public protected default
    protected void testDefault(){
	System.out.println("T2 testDefault!!");
    }
    //@Override
    //private 是一個新函數  不能覆寫
    protected void testPrivate(){
	 System.out.println("T2 Private");
    }
}
