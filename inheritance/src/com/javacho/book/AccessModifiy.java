package com.javacho.book;

import com.package2.B;
import com.package3.E;

public class AccessModifiy {

	public static void main(String[] args) {
	//*����������
		//private < default < protected < public
		//public : ��� ��Ű�� ��ο��� ��밡��
		//protected : ���� ��Ű�� �Ǵ� ��ӹ޴�(�ڳ�Ŭ����) ���迡 �ִ� �ٸ� ��Ű������ ��밡��
		//default : ���� ��Ű��
		//private : Ŭ���� �������� ��밡��
		
		//Ŭ����: public , default
		//����: public , protected , default , private
		//������: public , protected , default , private
		//�޼ҵ�: public , protected , default , private
		//�� ���������� ���Ұ�.
		
		//public�� ��쿡�� ��Ű���� ������� ������ ����� �����ϴ�.
		//��, protected�� ��ӿ� ���� �ٸ� ��Ű������ ����� ������.
		
		//(���� �����ڿ� private�� ��ҵ��� ����� �Ұ����ϴ�.)
		
		
		B b = new B(10);
		//C c = new C(10); //error: �����ڰ� default�ϱ� ����(public���� �� �ٲ��༭)
		//E e = new E(30); //error: �����ڰ� private�ϱ� ����
		//F f = new F(50); // error: �����ڰ� private�ϱ� ����
		
	}
}
