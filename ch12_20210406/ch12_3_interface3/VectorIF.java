/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210406.ch12_3_interface3;

/**
 *
 * @author xvpow
 */
public interface VectorIF {
    public void add(int value);
    public int get(int index);    
    public int size();
    //1.8才有的
    public default void foreach(){
	for (int i = 0;i < size();i++){
	    System.out.println(get(i));
	}
    }
}
