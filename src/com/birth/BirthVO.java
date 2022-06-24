package com.birth;

import java.io.Serializable;

public class BirthVO implements Serializable{
	
	   private String name;
	   private String birthDay;
	   private int score;
	   
	   
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getBirthDay() {
	      return birthDay;
	   }
	   public void setBirthDay(String birthDay) {
	      this.birthDay = birthDay;
	   }
	   public int getScore() {
	      return score;
	   }
	   public void setScore(int score) {
	      this.score = score;
	   }
	   
	   @Override
	public String toString() {
		   String str = String.format("%s  %s  %d",name,birthDay,score);
		   
		   return str;
	}

}
