package quiz13;

public class MainClass {
	
	public static void main(String[] args) {
		
		Unit m = new Marine(1,2);
		m.location();
		m.move(3, 4);
		m.stop();
	
		
		Unit t = new Tank(3,4);
		t.location();
		t.move(6, 6);
		t.stop();
		Tank tk = (Tank)t;
		tk.changeMode();
		
		
		Unit d = new DropShip(5,6);
		d.location();
		d.move(8, 8);
		d.stop();
		
		
		
		
		
		
		
		
		
	}

}
