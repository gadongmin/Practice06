package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {

		if ("음악".equals(str)) {
			playMusic();
		} else if ("앱".equals(str)) {
			app();
		} else {
			super.execute(str);
		}

	}

	// 메소드작성
	public void app() {
		System.out.println("다운로드해서 음악재생");
	}
}
