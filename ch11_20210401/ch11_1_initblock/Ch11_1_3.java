/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210401.ch11_1_initblock;

/**
 *
 * @author xvpow
 */
public class Ch11_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	//只會執行一次
	//Static Block
	//以下每new執行一次
	//Not Static 
	//Constructor
	TestInitBlockOrder tbo1 = new  TestInitBlockOrder();
	TestInitBlockOrder tbo2 = new  TestInitBlockOrder();
    }
    
}
