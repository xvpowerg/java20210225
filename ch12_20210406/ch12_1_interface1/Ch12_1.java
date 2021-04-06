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
public class Ch12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Wifi wifiRouter = new WifiRouter();
	System.out.println(wifiRouter.getChannel());
	wifiRouter.readData(wifiRouter.getData());
    }
    
}
