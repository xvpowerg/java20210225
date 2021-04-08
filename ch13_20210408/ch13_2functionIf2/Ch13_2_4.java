/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210408.ch13_2functionIf2;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */

class PluseCalculation implements UnaryOperator<Integer>{
    private int n;
    PluseCalculation(int n){
	this.n = n;
    }
    public Integer apply(Integer v){
	return v + n;
    }
}
class MultipCalculation implements  UnaryOperator<Integer>{
      private int n;
      MultipCalculation(int n){
	this.n = n;
    }
        public Integer apply(Integer v){
	return v * n;
    }
}
public class Ch13_2_4 {

  static void testArray(int[] array,UnaryOperator<Integer> operator){
      for(int i = 0; i < array.length;i++){
	 array[i] = operator.apply(array[i]);
      }      
  }
  
    public static void main(String[] args) {
	// TODO code application logic here
	UnaryOperator<Integer> p1 = new MultipCalculation(5);
	int[] array = {1,2,3,4,5};
	testArray(array,p1);
	for (int v : array){
	    System.out.println(v);
	}
    }
    
}
