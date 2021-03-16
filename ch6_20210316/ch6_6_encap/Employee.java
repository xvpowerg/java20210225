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
public class Employee {
    int baseSalary = 25000;
    private String name;
    int age;
   private int salary;
   Employee(){       
   }
   Employee(String name,int inAge,int salary){
       setName(name);
       age = inAge;
       setSalary(salary);
   }
   public void setName(String inName){
       if (inName == null || 
	       inName.length() < 2 || inName.length() > 30 
	       ){
	   System.out.println("錯誤的姓名");
	   name = "未命名!";
	   return;
       }       
       name = inName;
   }
   public String getName(){
       return name;
   }
   
   
   //設定
   public void setSalary(int inSalary){
       if (inSalary < baseSalary){
	   System.out.println("錯誤的薪資:"+inSalary);
	   inSalary = baseSalary;	   
       }
       salary = inSalary;
   }
   //取得
   public int getSalary(){
       return salary;
   }
    //需求
    void print(){
	System.out.println(name+":"+age+":"+salary);
    }
    
}
