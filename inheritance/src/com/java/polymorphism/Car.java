package com.java.polymorphism;

public class Car {
	String color;
	int door;

	void driver() {
		System.out.println("drive gogo");
	}

	void stop() {
		System.out.println("stop");
	}

   //*������(polymorphism)�̶� �ϳ��� ��ü�� ���� ���� Ÿ���� ���� �� �ִ� ���� �ǹ��մϴ�.
	// �Ű����� Car Ÿ������ ����
	// Car -> Car,FireEngine,Ambulance �ڽ�Ÿ�� ��ü�� ������ ���� �� �ִ�.
	void doWork(Car c) { // �Ű������� Ȱ���� ��ü�� ������

		// c.water(); - error // 'water();'��  FireEngineŬ�������� �����ϴ� �޼ҵ�
		                      // ���� ������ CarŸ�� �����δ� ��� �� �� ����. 
                              // ����Ϸ��� FireEngineŸ�� ������ ��� �ؾߵ� 
                              // (�θ�Ŭ���� Ÿ���� �ڽ� Ŭ������ ��ü�� ������ ���� �� ������
		                      // �ڽ�Ŭ������ �޼ҵ带 ��� �� �� ����.) 
		                      // = instanceof�� �̿��Ͽ� ��ü Ÿ�� Ȯ�� �� ��������ȯ�Ͽ� ����Ѵ�.
		
		// instanceof
		// ��ü�� Ÿ���� Ȯ���Ѵ�.
		if (c/* (��������) */ instanceof FireEngine /* Ŭ�����̸�(�˰� ���� Ÿ��) */) {
			FireEngine fe = (FireEngine) c;
			fe.water();
		} else if (c instanceof Ambulance) {
			Ambulance ab = (Ambulance) c;
			ab.siren();
		}

	}
}
