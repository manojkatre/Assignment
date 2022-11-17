package com.assignment.day2.class_object;

public class height {
         private int feet;
		 private int inches;
	 public height(int feet,int inches)
		 {
			 this.feet=feet;
			 this.inches=inches;
		 }
public int getFeet() {
			return feet;
		}
 public void setFeet(int feet) {
			this.feet = feet;
		}
 public int getInches() {
			return inches;
		}
public void setInches(int inches) {
			this.inches = inches;
		}
public static height inches1(int inches)
{
	return new height(inches / 12,inches % 12);
}
	public int inches2()
	{
		return feet * 12 + inches;
	}

public height add(height h1)
{
	return height.inches1(this.inches2() + h1.inches2());
}
public static void main(String[] args) {
	height h1=new height(5,10);
	height h2=new height(2,4);
	System.out.println(h1.add(h2));

}

}



