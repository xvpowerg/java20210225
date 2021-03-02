/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210302;

/**
 *
 * @author xvpow
 */
public class Ch2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	
	//case 參數不可重複
//	int t2 = 10;
//	
//	switch(t2){
//	    case 1020:
//		break;
//	    case 1_0_20://錯誤點
//		break;
//	}

    String name = "Tom";
	switch(name){
	    case "Ken":
		System.out.println("經理");
		break;
	    case "Lindy":
		System.out.println("PM");
		break;
	    case "Tom":
		System.out.println("RD");
		break;
	    default:
		System.out.println("Error!");
		break;
		
	}
	
    }
    
}
