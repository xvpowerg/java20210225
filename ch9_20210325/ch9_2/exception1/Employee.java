/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210325.ch9_2.exception1;

/**
 *
 * @author xvpow
 */
public class Employee {
    private String name;
    private int salary;
    
    public void setName(String name){
	if (name == null || name.isEmpty() || 
	name.length() < 2 || name.length() > 30){
//	    System.out.println("錯誤的姓名");
//	    return;
//無效參數的例外
	    throw new IllegalArgumentException("錯誤的姓名");
	}
	this.name = name;
    }
    public void setSalary(int salary){
	if (salary < 25000 || salary > 500000){
	 throw new IllegalArgumentException("錯誤的金額");
	   
	}
	this.salary = salary;
    }
    //需求
    //姓名不可空白 null 長度小可於2大於30 
    //如果有問題 輸出 錯誤的姓名
    //Salary不可小於25000  大於 500000
    //如果有問題 輸出 錯誤的薪資
    public void  print(){
	System.out.println("Name:"+name+" Salary:"+salary);
    }
	    
}
