/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch21_20210506.stream2;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch21_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here	
	ArrayList<Integer> list = new ArrayList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	   
	   int sum = list.stream().mapToInt(i->i).sum();
	   double avg = list.stream().mapToInt(i->i).average().getAsDouble();
	   long  sumLong =  list.stream().mapToInt(i->i).summaryStatistics().getSum();
	   double avg2 = list.stream().mapToInt(i->i).summaryStatistics().getAverage();
	   System.out.println(sum);
	   System.out.println(sumLong);
	   System.out.println(avg);
	   System.out.println(avg2);
	
	 Optional<Integer> op =  list.stream().reduce((v1,v2)->{
	       System.out.println(v1+":"+v2);
	   return v1+v2;
	   });
	 System.out.println(op.get());
	 
	 ArrayList<String> nameList = new ArrayList();
	 nameList.add("Ken");
	 nameList.add("Vivin");
	 nameList.add("Lindy");
	 Optional<String> opStr = 
		 nameList.stream().reduce((n1,n2)->{
		     System.out.println(n1+"_"+n2);
		 return n1+":"+n2;
		 });
	 opStr.ifPresent(s->System.out.println(s));
	 
    }
    
}
