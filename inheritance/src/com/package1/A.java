package com.package1;

import com.package3.E;

public class A extends E{

	public int a;

	public A(int a) {
		super(10); //E�� �����ڰ� private�ϱ� ������ ȣ�� �Ұ�
		this.a = a;
	}
	
	public void printA() {
		System.out.println(a);
	}
}
