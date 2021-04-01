/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210401.ch11_5_abstract.report;
import  ch11_20210401.ch11_5_abstract.erp.TestErp;
/**
 *
 * @author xvpow
 */
public class TestReport extends TestErp{
    protected  void reportStyle(String[] data){
	for(String  n : data){
	    System.out.println(n);
	}	
    }

}
