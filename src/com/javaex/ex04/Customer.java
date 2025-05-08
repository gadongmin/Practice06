package com.javaex.ex04;

public class Customer extends User {
	// 필드
	private int point;

	// 생성자
	public Customer() {
	}

	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}

	// 메소드-gs
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// 메소드-일반
	public void showInfo() {
		System.out.println("#아이디: " + id + " #비밀번호: " + password + " #이름: " + name + " #포인트: " + point);
	}

}
