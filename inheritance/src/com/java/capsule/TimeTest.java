package com.java.capsule;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(3.14);
		//t.hour = 48;   //0~23
		t.setHour(48);
		System.out.println(t.getHour());
		
	}
	
	//��� : extends
	//������ : �����ε�, �������̵� , ����� Ȱ��
	//ĸ��ȭ(�����ͺ�ȣ): ����������(private)
}
