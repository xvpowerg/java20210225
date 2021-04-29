/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210429.Ch19_1_treemap;

/**
 *
 * @author xvpow
 */
public class Item {
    private String itName;
    private int id;
    public int getId() {
	return id;
    }
    public Item(String itName, int id) {
	this.itName = itName;
	this.id = id;
    }
    public String getItName() {
	return itName;
    }
    @Override
    public String toString() {
	return "Item{" + "itName=" + itName + ", id=" + id + '}';
    }
    	    
}
