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
public enum SortType{
	    ASC(1),
	    DESC(-1);
	    private int offSet;
	    private  SortType(int offSet){
		this.offSet = offSet;
	    }
	    public static SortType getSortType(int type){
		if (type != 2){
		    return ASC;
		}else{
		    return DESC;
		}
	    }
	    public int getOffSet(){
		    return offSet;
	    }
	}