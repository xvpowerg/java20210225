/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210309;

public class Ch4_5 {
    //void 無回傳值
    //test1 函數名稱
    //()可傳入參數
    static void test1(){
	System.out.println("Test!1");
    }
    static int test2(int v1,int v2){
	int ans = v1 -v2;
	//return 可以回傳 數值 
	//或者離開方法(函數)
	return ans;
    }
    
    static int sum(int[] array){
	int ans = 0;
	if (array == null) return ans;
	    for (int v : array){
		ans += v;
	    }	
	return ans;
    }
    //幫我找到最大值
     static int max(int[] array){
	 if (array==null || array.length == 0){
	     return -1;
	 }
	 //取得數最小值
	 int ansMax = Integer.MIN_VALUE;
	 for(int v : array){
	     if (v > ansMax) ansMax = v;	     
	 }
	return ansMax; 
     }//
    //static 只能呼叫static的
    public static void main(String[] args) {
		
	test1();
	int v = test2(10,2);
	System.out.println(v);
	int ans = sum(new int[]{5,2,3,11});
	System.out.println(ans);
	sum(null);
	
	int maxValue = max(new int[]{7,8,5,15,2});
	System.out.println(maxValue);
    }
    
}
