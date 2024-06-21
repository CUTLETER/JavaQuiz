package quiz13;

public class Tank extends Unit {
	
	public Tank(int x, int y) {
		super(x, y, 100);
	}

	public boolean modeFlag = false;

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("위치 변경 : "+this.x+", "+this.y);
	}
	
	public void changeMode() {
		modeFlag = modeFlag ? false : true;
	}



	@Override
	public void location() {
		System.out.println("현재 위치 : "+x+", "+y);
		
	}

}
