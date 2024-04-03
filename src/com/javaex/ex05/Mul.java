package com.javaex.ex05;

public class Mul {

    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    public void Mul() {
    	System.out.println(a*b);
    }

    
    public int calculate(int Mul) {
    	System.out.println(a*b);
		return Mul;
    }

}
