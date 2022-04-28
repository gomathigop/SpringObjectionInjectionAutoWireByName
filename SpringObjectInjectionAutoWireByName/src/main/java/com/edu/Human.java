package com.edu;

public class Human {
	private Heart heart;
	//AutoWire ByName

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method is called");
	}
	
	public void humanFunction() {
		if(heart!=null) {
			heart.pump();
		}
		else {
		   System.out.println("Not Alive");
		}
	}

}


