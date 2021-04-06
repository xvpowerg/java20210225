/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210406.ch12_2_interface2;

/**
 *
 * @author xvpow
 */
public class Ch12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// 類別跟介面的關係是實作
	Fly fly = new Gundam();
	fly.flying();
	Jump jump = (Jump)fly;
	jump.jumping();
	// 介面跟介面的關係是繼承
	GundamSkill gundam = new Gundam();
	gundam.flying();
	gundam.jumping();
	gundam.attacking();
    }
    
}
