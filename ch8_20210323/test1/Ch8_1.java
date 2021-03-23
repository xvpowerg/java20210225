/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210323.test1;

/**
 *
 * @author xvpow
 */
public class Ch8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//每一組Constructor會呼叫 父類的預設建構式
	//所以輸出時會顯示Test1 Constructor
	//多型
	Test1 t2 = new Test2();
	t2.cut();
    }
    
}
