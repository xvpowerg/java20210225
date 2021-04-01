/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210401.ch11_5_abstract.erp;

/**
 *
 * @author xvpow
 */
public  abstract class TestErp {
    
    private String[] readData(){
	return new String[]{"Ken,100,98,71",
	"Vivin,87,56,23"};
    }
    protected abstract void reportStyle(String[] data);
    public final void exportReport(){
	String[] strArray = readData();
	reportStyle(strArray);
    }
}
