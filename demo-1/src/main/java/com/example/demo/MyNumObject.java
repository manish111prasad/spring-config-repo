package com.example.demo;

public class MyNumObject {
    private int Naman;  // Default value
    private int num2;  // Default value

    // Constructors
    public MyNumObject() {						// Default constructor
    	
    }  					 
    public MyNumObject(int Naman, int num2) {	//Parameterized constructor 
        this.Naman = Naman;
        this.num2 = num2;
    }

    // Getters & Setters
    public int getNaman() {
    return Naman; 
    }
    
    public void setNaman(int Naman) {
    this.Naman = Naman; 
    }

    public int getNum2() {
    return num2; 
    }
    public void setNum2(int num2) {
    this.num2 = num2; 
    }
}

