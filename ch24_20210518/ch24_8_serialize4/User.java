/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch24_20210518.ch24_8_serialize4;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class User   {
    private String name;

    public User(String name) {
	this.name = name;
    }
    public String toString(){
	return name;
    }
}
