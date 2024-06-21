package quiz13;

public class Marine extends Unit {

	private static int attack = 6;
	private static int armor = 0;

	public Marine(int x, int y) {
		super(x, y, 60);
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("위치 변경 : "+this.x+", "+this.y);
	}

	@Override
	public void location() {
		System.out.println("현재 위치 : "+x+", "+y);
	}


}
