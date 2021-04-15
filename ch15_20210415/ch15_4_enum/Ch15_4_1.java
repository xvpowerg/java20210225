/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210415.ch15_4_enum;

/**
 *
 * @author xvpow
 */
public class Ch15_4_1  {
    /*
    限制選項 enum  
    enum 
    */
    enum Fruit{
	APPLE,
	BANANA,
	KEWI;
	 public String toString(){
	     return "水果:"+this.name();
	 }
    }
    //列舉做了什麼是
    //1 Fruit extend Enum
    //第一次呼叫enum時做new 列舉選項的動作
    //3 APPLE = new Fruit("APPLE",0)
    //3 BANANA = new Fruit("BANANA",1)
    //4 KEWI = new Fruit("KEWI",2)
    static void testEnum(Fruit fr){
	
    }
    public static void main(String[] args) {
	
	testEnum(Fruit.KEWI);
	
	System.out.println(Fruit.APPLE);
	Object obj = Fruit.APPLE;
	System.out.println(Fruit.APPLE == obj);
	
	System.out.println(Fruit.APPLE.name());
	System.out.println(Fruit.APPLE.ordinal());
	
	System.out.println(Fruit.KEWI);
	System.out.println(Fruit.KEWI.ordinal());
    }
    
}
