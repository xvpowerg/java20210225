/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210413.Ch14_1_InnerClass1;

public class Student {
   private int gradesCount;
   private int index;
   private String  stName;
   private Grades[] grades;
   
   public Student(String stName,int count){
       this.stName = stName;
       gradesCount = count;
       grades = new Grades[gradesCount];
       index = 0;
   }   
   public void appendGrades(String gName,int score){
       Grades g = new Grades(gName,score); 
       grades[index++] = g;
   }
   public void foreachGrades(){
       for (Grades g : grades){
	   System.out.println(g);
       }
   }
  private class Grades{
      private String  gName;
      private int score;	
      Grades(String gName,int score){
	  this.gName = gName;
	  this.score = score;
      }      
      public String toString(){
	return stName+":"+ gName+"成績:"+score; 
      }
  }  
}
