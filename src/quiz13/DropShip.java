package quiz13;

public class DropShip extends Unit {
	
	public DropShip(int x, int y) {
		super(x, y, 200);
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
