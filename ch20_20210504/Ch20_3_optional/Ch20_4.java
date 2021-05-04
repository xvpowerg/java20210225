/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210504.Ch20_3_optional;
import java.util.Optional;
public class Ch20_4 {

    public static void main(String[] args) {
	String name= null;
	//不可將null轉換為Optional
	//Optional<String> o1 = Optional.of(name);
	//可將null轉換為Optional
	Optional<String> o2 = Optional.ofNullable(name);
	//System.out.println(o1.get());
	//只要內容null一定出錯
	//System.out.println(o2.get());
	
	//內容非null
	/*Optional<String> o3 = Optional.ofNullable("Vivin");
	System.out.println(o3.isPresent());//true
	//如果內容不是null輸出內容
	o3.ifPresent(v->System.out.println(v));
	//如果內容不是null回傳內容
	String v1 =  o3.orElse("Empty");
	System.out.println(v1);
	//如果內容不是null回傳內容
	String v2 = o3.orElseGet(()->"EG Empty");
	System.out.println(v2);
	//如果內容不是null回傳內容 是null拋出例外
	String v3 =  o3.orElseThrow(()->new RuntimeException("例外!!"));
	System.out.println(v3);*/
	//內容是null
	Optional<String> o3 = Optional.ofNullable(null);
	System.out.println(o3.isPresent());//false
	o3.ifPresent(v->System.out.println(v));//不會執行Consumer
	//如果內容是null回傳預設值
	String v1 =  o3.orElse("Empty");
	System.out.println(v1);//Empty
	//如果內容是null回傳預設值
	String v2 = o3.orElseGet(()->"EG Empty");
	System.out.println(v2);//"EG Empty"
	//如果內容是null拋出例外
	String v3 =  o3.orElseThrow(()->new RuntimeException("例外!!"));
	System.out.println(v3);
	
    }
    
}
