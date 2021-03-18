/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210318.overwrite;

class Shape{
    public float length(){return 0;};
}
class Square extends Shape{
    private float w,h;
    public Square(float w,float h){
	this.w = w;
	this.h = h;
    }
    @Override
    public float length(){
        float ans = (w+h)*2;
	return ans;
    }
}
//作業
class Circle{
    private float r;
    final float PI = 3.1415f;
    //2 pi r
}
	
public class Ch7_3_3 {
    public static void main(String[] args) {
	//使用多型設計兩組類別 
	//1 Shape
	//2 方形 Square h w 
	//3 圓形 Circle r
        //計算方型 圓形的 長度 length()	
//在	new Square() 給w 與 h
	Shape shape1 = new Square(2,5);
	System.out.println(shape1.length());
	
    }
    
}
