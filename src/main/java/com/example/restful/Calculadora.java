package com.example.restful;

public class Calculadora {
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
	
	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getsoma() {
		return a+b;
	}
}
