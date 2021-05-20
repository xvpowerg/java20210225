/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch25_20210520.cj25_1_nio2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
public class Ch25_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	Path p1 = Paths.get("C:", "mydir","nio2.txt");
	String msg = "星野源年收入4.5億日幣！娶新垣結衣5關鍵曝光";
	String txt = "全亞洲宅男心碎，「國民老婆」新垣結衣假戲真做，"
		+ "閃婚年長8歲的星野源，兩人當初合作的《月薪嬌妻》變成真實紀錄片，"
		+ "叫人如何不崩潰？男性忿忿不平，星野源長相不帥氣，"
		+ "身高僅168公分，還比169公分的女主角略矮，"
		+ "如何抱得美人歸？其實，星野源身兼演員、歌手、散文作家等多重身分，"
		+ "2018年甚至登上演藝圈吸金男排行榜第3名，年收入高達4.5億元日幣，"
		+ "跟新垣結婚根本超級匹配啊！";
	String[] values = txt.split("，");
	List<String> list = Arrays.asList(values);
	try{
		//Files.write(p1, txt.getBytes());		
		Files.write(p1, list);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
    }
    
}
