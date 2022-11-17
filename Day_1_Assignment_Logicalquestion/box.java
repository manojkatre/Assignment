package com.montu.d1;

public class box 
{
private int length;
private int breath;
private int height;
/*public box(int length, int breath, int height) {
	super();
	this.length = length;
	this.breath = breath;
	this.height = height;
	
}*/

public box()
{
	this(0);
	System.out.println("0 cons");
	
}
box(int length){
	this(0,0,0);
	System.out.println("1 cons");
	
}
public box(int length, int breath, int height) {
	super();
	this.length = length;
	this.breath = breath;
	this.height = height;
	System.out.println("3 constuctor");
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
public int calvolume() {
 return length*breath*height;
}
}
	
	

	