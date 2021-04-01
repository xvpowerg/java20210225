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
public class Ch11_1 {
    public static void main(String[] args) {
	InitBlock initBlock = new InitBlock();
	System.out.println(initBlock.array[50]);
	
	InitBlock initBlock2 = new InitBlock("Tag1");
	System.out.println(initBlock2.tag);
	System.out.println(initBlock2.array[99]);
    }
    
}
