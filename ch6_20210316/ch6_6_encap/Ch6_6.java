/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210316.ch6_6_encap;

/**
 *
 * @author xvpow
 */
public class Ch6_6 {
//封裝 Encapsulation
    // 私有化封裝的屬性
    //可提供相對應的公開方法
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	Employee emp1 = new Employee();
	//emp1.name = "Ken";
	emp1.age = 28;
	//emp1.salary = 35000;
	emp1.setSalary(3500);
	emp1.setName(null);
	emp1.print();
	//name
	//長度最少2 最大30
	//不可為null
	//錯誤的姓名
	
	//建構式Constructor
	Employee emp2 = new Employee("Vivin",27,56000);	
	emp2.print();
    }
    
}
