package com.java.print;

public class Print3DTest {

	public static void main(String[] args) {
		
//		Print3D p3 = new Print3D(); //��� ���谡 �ƴϱ� ������ super�� �� �� ����.
//		// Print3D() -> Print() -> object()
//		            
//		
//		p3.x = 10;
//		p3.y = 20;
//		p3.z = 30;
//		
//		String point = p3.getLocation(); 
//		System.out.println(point);
		
		Print3D p3 = new Print3D(100,200,30);
		
		String point = p3.getLocation(); 
		System.out.println(point);
		
	}

}
