package com.package5;

import com.package4.Time;

public class TimeChild extends Time {
	void printAll() {
		//System.out.println(hour);
		//System.out.println(nanosec);
		System.out.println(min); //protected   //��� ���������� protected�� public�� ����.
		System.out.println(sec); // public
	}
}
