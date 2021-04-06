/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210406.ch12_3_interface3;
import java.util.ArrayList;
public class IntegerList implements VectorIF{
    private ArrayList<Integer> list = new ArrayList();
    
     public void add(int value){
	    list.add(value);
     }
    public int get(int index){
	return list.get(index);
    } 
    public int size(){
	return list.size();
    }

}
