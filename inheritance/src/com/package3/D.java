package com.package3;

public class D {
	C c = new C(10);
	//E e = new E(30); //error: �����ڰ� private�ϱ� ����(���� ��Ű���� ������ �ȵ�)
	F f = new F(30);
	


	void printD() {
		System.out.println(c.c);
		f.printF();
		f.f = 30;
	}
}
