package com.java.print;

public class Print {

	public int x;
	public int y;
	
//	Print (){
//		super();   //Object Ŭ������ �����ڸ� ȣ��
//	}// - �⺻�������� ���
	
   // �� �ٸ� ��Ű����  TvŬ�������� ������ Ŭ������ ���(����)�ϱ� ���� �տ� public�� �ٿ���ߵȴ�.
	public Print(int x, int y) {
		this.x = x;
		this.y = y;
	} // - �⺻�����ڰ� �ƴ� ���
	
	public String getLocation() {
		return "x: "+ x +", y: "+ y;
		
	}
}
