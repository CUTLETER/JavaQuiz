package quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
		Shape s = new Circle("원", 3);
		System.out.println(s.getName());
		System.out.println("넓이 : " + s.getArea());
		
		Shape t = new Rect("사각형", 12);
		System.out.println(t.getName());
		System.out.println("넓이 : " + t.getArea());
		
		
	}

}
