/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210427;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch18_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	 //3 8 9 7 1  O(n^2)
	 //幫我找出  兩數相加為10的
	 //只能用Map
	//O(n) 
	int[] values = {3,8,9,7,1};
	int n = 10;
	HashMap<Integer,Integer> map = new HashMap<>();
	for (int v : values){
	    if (map.containsKey(v)){
		System.out.println(v+":"+map.get(v));
	    }
	    map.put(n -v, v);
	}
    }
    
}
