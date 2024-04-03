package com.javaex.ex05;

public class Add {
    
    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
   
    public void add() {
    	System.out.println(a+b);
    }
    public int calculate() {
    	System.out.println(a+b);
    	return a;
		
    }
   

}
