package com.xyz;

public class typecasting {
	public static void main(String[] args) {
		//widening
		byte b = 10;
		int l = b;
		System.out.println(l);
		
		float f =22.14f;
		double d = f;
		System.out.println("d");
		
		char ch = 'A';
		int i = ch;
		
		//Narrowing
		int i2 = 256;
		byte b1 = (byte) i2;
		System.out.println(b1);
		
	}

}
