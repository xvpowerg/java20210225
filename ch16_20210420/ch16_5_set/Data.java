/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210420.ch16_5_set;

/**
 *
 * @author xvpow
 */
public class Data {
    private int value1;
    private String value2;
    Data(int value1,String value2){
	this.value1 = value1;
	this.value2 = value2;
    }
    public String toString(){
	return value1+":"+value2;
    }
    public boolean equals(Object obj){
	if (obj == null || obj instanceof Data == false){
	    return false;
	}
	System.out.println("equals:"+value2);
	Data tmp = (Data)obj;
	return this.value1 == tmp.value1 && this.value2.equals(tmp.value2);	
    }
    
    public int hashCode(){
	 
	System.out.println("hashCode:"+value2);
	return value1+value2.hashCode();
    }
    
}

