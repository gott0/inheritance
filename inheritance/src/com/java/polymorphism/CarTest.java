package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {
//		FireEngine f = new FireEngine();
//		Ambulance ab = new Ambulance();
		
		//�������� ������ ��ü����
		//�������� ����ȯ(������ �� �ִ� ����� ������ ���Ѵ�.)*
//		Car car = null;
//		FireEngine fe = new FireEngine(); // ���������� �ּҰ��� ����
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe; // '�ڵ�����ȯ' : Car Ÿ�� = FireEngine Ÿ��(�θ�=ūŸ��, �ڽ�=���� Ÿ�� - '��ӱ������� ����')
//		          // double = int (�տ� �ִ� ������ Ÿ���� ũ�� �����ϴ� - ���� ������ ����)
//		//car.water(); error - ���������� ����ȯ�� �Ͼ ������ CarŸ���� �ǹǷ� FireEngine�� ����� ����� �� ����.
//		car.stop();
//		fe2 = (FireEngine)car; // ���� Ÿ��(fe2)�� ū Ÿ��(car)�� ���� ��ų�� '��������ȯ'����
//		fe2.water();
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance(); //�ڽ�
		
		Car car = new Car(); //�θ�
		car.doWork(fe);
		car.doWork(ab);
	}

}
