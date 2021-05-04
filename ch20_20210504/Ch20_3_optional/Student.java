/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210504.Ch20_3_optional;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
	this.name = name;
	this.score = score;
    }

    public Optional<String> getName() {	
	return Optional.ofNullable(name);
    }

    public int getScore() {
	return score;
    }
    
}
