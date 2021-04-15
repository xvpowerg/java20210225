/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210415.ch15_1_methodReferences1;

/**
 *
 * @author xvpow
 */
public class Tool {
    private String description;
    public void setDes(String des){
	this.description = des;
    }

    public String toString(){
	return description;
    }
}
