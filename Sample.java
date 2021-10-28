package com.sample.utils;

public class Sample {
	
	
	private int x = 10;
	
	public int y = 20;
	
	public static int z = 30;
	
	public static final int A = 30;
	
	public static String CITY_NAME = "Texas";
	
	public static void main(String[] args) {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		A = 40;
		System.out.println(A);
		
		if(CITY_NAME == "Texas") {
			System.out.println("Yes. City name is Texas.");
		}
		
		
		while(z == 30) {
			System.out.println("Yes the value of z is" + z);
			int XYZ = z/5;
			
			System.out.println(XYZ);
		}
	}

}
