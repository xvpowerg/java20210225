/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210323.modifier;

/**
 *
 * @author xvpow
 */
public class Ch8_4 {

    /**
     * @param 修飾詞
     */
    public static void main(String[] args) {
	//在不同package要import
	/*
	  public  所有都可存取
	  protected 相同Package 或 繼承 可存取
	  default(空白) 相同Package可存取
	  private 相同類別可存取
	*/
	Test1 t1 = new Test1();
	System.out.println(t1.publicValue);
	System.out.println(t1.protectedValue);
	System.out.println(t1.defaultValue);
	
	t1.testPublic();
	t1.testProtected();
	t1.defaultMethod();
    }
    
}
