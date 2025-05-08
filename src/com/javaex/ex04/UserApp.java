package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] uArr = new User[3];

		User c1 = new Customer("jws", "j1234", "정우성", 1000);
		User c2 = new Customer("yjs", "y2345", "이효리", 2000);
		User e1 = new Employee("master", "m7788", "운영자", 500);

		uArr[0] = c1;
		uArr[1] = c2;
		uArr[2] = e1;

		for (int i = 0; i < uArr.length; i++) {
			uArr[i].showInfo();
		}

	}

}
