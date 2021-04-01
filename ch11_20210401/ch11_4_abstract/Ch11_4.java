/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210401.ch11_4_abstract;

/**
 *
 * @author xvpow
 */
public class Ch11_4 {

    /**
     * 抽象類別
     * 某種類型是通稱:
     * 抽象類別限制
     * 不可new
     * 類別不可final
     * 抽象方法也不可final
     * 類別有抽象方法 必須變為抽象 
     * 是抽象類別 不一定需要抽象方法
     * 抽象方法意思:
     * 提醒開發人員要覆寫一種語法
     * 
     */
    public static void main(String[] args) {
	Animal a = new Dog("Momo",18);
	System.out.println(a);
	a.skill();
    }
    
}
