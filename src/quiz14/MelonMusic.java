package quiz14;

import java.util.Arrays;

public class MelonMusic implements SongList {

	/*
	 * SongList인터페이스를 상속받아서 기능을 구현합니다.
	 * insertList() 는 list배열에 순서대로 저장
	 * playList() list의 음악을 랜덤하게 출력
	 * playLength() 는 저장된 음악의 개수를 반환
	 */
	
	private String[] list = new String[10];
	private int count = 0;
	
	
	@Override
	public void insertList(String song) {
		list[count] = song;
		count++;
		
	}
	@Override
	public void playList() {
		for (int i=0; i<count; i++) {
			int random = (int)(Math.random()*count);
			 System.out.println(list[random]);
		} 
		
	}
	@Override
	public int playLength() {
		return count;
	}
	

}
