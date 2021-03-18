/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210318.extend1;

/**
 *
 * @author xvpow
 */
public class Ch7_2 {

    /**
     * @param args the command line arguments
     */
    //繼承
    //會繼承父類別的某些能力
    //繼承所有public 與  protected 的方法與屬性
    public static void main(String[] args) {
	// TODO code application logic here
	Student st1 = new Student();
        st1.setName("飯糰小丸子");
	st1.setHeight(152);
	st1.setAge(10);
	st1.printInfo();
	Student st2 = new Student("明日香",18,172);
	st2.printInfo();
	//可使用多型(polymorphism)
	// 低耦合
	Person p1 = st2;
	p1.printInfo();
	
	Person te1 = new Teacher("李包恩",10,15);
	te1.printInfo();
	
    }
    
}

