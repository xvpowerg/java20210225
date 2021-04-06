/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210406.ch12_3_interface3;

public class Vector  implements VectorIF {
    private int[] data = new int[1000000];
    private int index = -1;
    public void add(int value){
	data[++index] = value;
    }
    public int get(int index){
	if (index < 0 || index > this.index){
		throw new IndexOutOfBoundsException();
	}
	return data[index];
    }
    
    public int size(){
	return index + 1;
    }

}
