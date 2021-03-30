/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210330.ch10_2_obj;

/**
 *
 * @author xvpow
 */
public class Ch10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//所有物件都繼承Object
	Test1 t1 = new Test1("T1 msg");
	System.out.println(t1);
	System.out.println(t1.getClass().getName()+"@"+Integer.toHexString(t1.hashCode()));
	
	Test1 t2 = new Test1("msg1");
	Test1 t3 = new Test1("msg1");
	System.out.println(t2);
	System.out.println(t3);
	System.out.println(t3 == t2);
	System.out.println(t3.equals(t2) );
	
	Exception ex = new Exception();
	//如果是null回傳false
	System.out.println(t3.equals(null) );
	//如果不同類型回傳false
	System.out.println(t3.equals(ex) );

    }
    
}
