/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210413.Ch14_3_lambda1;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Ch14_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//無參數 有回傳 完整版
	Supplier<String> s1 = ()->{return "Test1";};
	System.out.println(s1.get());
	//無參數 有回傳 當命令只有一條時可去除{} 不用輸入return 
	//java自動return
	Supplier<String> s2  = ()->"Test2";
	System.out.println(s2.get());
    }
    
}
