package quiz14;

public class BugsMusic implements SongList {
	
	private String[] list = new String[100];
	private int count = 0;
	
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 */
	
	
	@Override
	public void insertList(String song) {
		System.out.println("벅스뮤직 노래 추가");
		
	}
	@Override
	public void playList() {
		System.out.println("벅스뮤직 재생목록");
		
	}
	@Override
	public int playLength() {
		return count;
	}
	
	
	
}
