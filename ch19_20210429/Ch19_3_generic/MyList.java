/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210429.Ch19_3_generic;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyList<T> {
    private ArrayList<T> list = new ArrayList();
    public T get(int index){
	return list.get(index);
    }
    public void add(T value){
	list.add(value);
    }
    
    public int size(){
	return list.size();
    }
    
    public void foreach(Consumer<T> c){
	list.forEach(c);
   }
    
}
