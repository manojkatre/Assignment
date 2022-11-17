package com.montu.d1;

public class boxweigtht extends box
{
	
	private int length;
	private int breath;
	private int height;
	private int weigtht;
	public boxweigtht() {
		System.out.println("o argu");
	}
	
	
public boxweigtht(int length, int breath, int height) {
		super();
		this.length = length;
		this.breath = breath;
		this.height = height;
		System.out.println("4 argu");
	}



public int getLength() {
	return length;
}


public void setLength(int length) {
	this.length = length;
}


public int getBreath() {
	return breath;
}


public void setBreath(int breath) {
	this.breath = breath;
}


public int getHeight() {
	return height;
}


public void setHeight(int height) {
	this.height = height;
}
public int calDensity() {
	return this.weigtht/(this.length*this.breath*this.height);
}

public static void main(String args[])
{
	box b1=new box();
}
	
}
