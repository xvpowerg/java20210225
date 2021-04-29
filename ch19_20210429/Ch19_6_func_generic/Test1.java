/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210429.Ch19_6_func_generic;
import java.util.function.UnaryOperator;
public class Test1 {

public <T> T  func1(T v,UnaryOperator<T> uo){
    return uo.apply(v);
}
    
}
