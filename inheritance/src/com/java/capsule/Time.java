package com.java.capsule;

public class Time {
	private int hour;
	private int minute;
	private int second;
    // ���ٸ� Ŭ���������� �ҷ����� �� ������,���� Ŭ�������� ����
	// getter/setter�޼ҵ带 Ȱ���ϸ� �ٸ� Ŭ�������� �ҷ����Ⱑ ����
	final double PI;
	//�����(���� ���� �� �� ���� ������)�� ����� ���� 'final' �տ� ���δ�.
	//����� ��� ������ �빮�ڷ� (�����ڱ�Ģ)
	//��� �����ڸ� ���� �ʱ�ȭ ����
	public Time(double pI) {
		super();
		PI = pI;
	}
	
	
  //getter / setter �޼ҵ�
	public int getHour() { //����(�о�)���� ��
		return hour;
	} 

	public void setHour(int hour) { //����� ��
		if(hour < 0 || hour > 23) {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}// �ð� ���� ���� ���� �� �ش� ���� ��� = ��ȿ������
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(minute < 0 || minute > 23) {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if(second < 0 || second > 23) {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}
		this.second = second;
	}
	// => source - generate getter and setter �޴��� ���� ���� ����
	
	
	
	//getter�޼ҵ� /setter�޼ҵ� �����
	
//         // �������� ���� ���� Ÿ�԰� ���� ���ش�.
//	public int getHour() { //get,set �ڿ��� �����̸��� ���̰� �����̸��� ù���ڴ� �빮�ڷ� �ؼ� �޼ҵ���� ���´�.(��Ģ)
//		return hour;		
//	}
//	      //���������� ������ Ÿ���� ���� �ʿ� ����
//	public void setHour(int hour) {
//		this.hour = hour; //������ Ÿ���� ��������� �����ش�.
//	}
//	
//	public int getMinute() {
//		return minute;		
//	}
//	
//	public void setMinute(int minute) {
//		this.minute = minute;
//	}
//	public int getSecond() {
//		return second;		
//	}
//	
//	public void setSecond(int second) {
//		this.second = second;
//	}
}
