package com.example.demo.pojo;

public class MyNum {
	
	private int num1;
	private int num2;
	
	public MyNum() {						//Default Constructor
		
	}
	public MyNum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		System.out.println(num1+"++"+num2);
		return "MyNum [num1=" + num1 + ", num2=" + num2 + "]";
		
	}
	//System.out.println(num1+"+"+num2);
}
