package com.javaex.ex07;

public class MusicPhone extends Phone {

	public void execute(String str) {

		if ("음악".equals(str)) {
			playMusic();
		} else {
			super.execute(str);
		}

	}

	protected void playMusic() {
		System.out.println("다운로드에서 음악재생");
	}
}
