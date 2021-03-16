/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210316.ch6_5_obj1;

/**
 *
 * @author xvpow
 */
public class Ch6_5 {

    /**
     * 類別:
     * //屬性
     * 材質:
     * 顏色:
     * //功能 方法
     * 可以保溫()
     * 可以保冰()
     * 物件:
     * 由類別產生物件 類別先產生 才有物件
     */
    public static void main(String[] args) {
	// TODO code application logic here
	Book b1;
	b1 = new Book();
	b1.isbn = "ISB00111";
	b1.name = "Java 8";
	b1.price = 650;
	
	Book b2 = new Book();
	b2.isbn = "ISBN0002222";
	b2.name="Java Servlet";
	b2.price = 720;
	
	b1.printInfo();
	b2.printInfo();
	//System.out.println(b1.isbn+":"+b1.name+":"+b1.price);
	//System.out.println(b2.isbn+":"+b2.name+":"+b2.price);
    }
    
}
