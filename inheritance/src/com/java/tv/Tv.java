package com.java.tv;
//import com.java.print.Print; //����Ϸ��� Ŭ������ ��Ű���� �ٸ� ��� import�� �̿��� ������ �� �ִ�.
//import com.java.print.Print3D; // �� ����Ϸ��� Ŭ������ ��� �����  public���� �ٲ���� ��
//import com.java.print.*; // ��Ű�� ��ü�� Ŭ������ �� ��� .*�� ���ش�
//��Ʈ��+����Ʈ+"o" (�ڵ� import �����)

import com.java.print.Print3D; //�ڵ� import ����⸦ �̿��� ���

public class Tv { //��Ӱ� ������ ���� �ϴ� ���

//	Print print = new Print(10,20); // ���԰���
//	                        //�ν��Ͻ� ��� ����
	
	Print3D print = new Print3D(10,20,30);
	
	
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDwon() {--channel;}
	
}
