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
public interface Wifi {
    //String channel = "";
    //public abstract String getChannel();
    String getChannel();
    byte[] getData();
    void readData(byte[] data);   
}
