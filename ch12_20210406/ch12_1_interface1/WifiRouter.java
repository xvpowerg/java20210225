/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210406.ch12_1_interface1;

/**
 *
 * @author xvpow
 */
public class WifiRouter implements Wifi{
	
   public  String getChannel(){
       return "5G";
   }

    public byte[] getData(){
	return new byte[]{1,2,5,6,7};
    }

    public void readData(byte[] data){
	for (byte b : data){
	    System.out.println(b);
	}
    }
}
