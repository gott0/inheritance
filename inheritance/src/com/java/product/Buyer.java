package com.java.product;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) { // Tv, Computer, Audio �ڽ�Ÿ�� ��ü�� ������ ���� �� �ִ�.(Product�� Ÿ���� ����и𰳳�)
		if(money < p.price) {
			System.out.println("�ݾ��� �����մϴ�.");
			return;			
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
				System.out.println(p.toString()+"���ſϷ�");
	}
	
	
}

//Product p = new Tv() // ��� ������ ��� ���� 2��
//Tv t = new Tv()      // ��� ������ ��� ���� 2��