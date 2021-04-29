/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210429.Ch19_3_generic;
import java.util.List;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class TestGeneric1<LT,T extends List<LT>> {
    T myList;
    public void setList(T a){
	myList = a;
    }
    
    public void add(LT obj){
	myList.add(obj);
    }
    
    public void foeach(Consumer<LT> c){
	myList.forEach(c);
    }
    
}
