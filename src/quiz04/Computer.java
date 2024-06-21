package quiz04;

public class Computer extends Calculator {

	/*
	 * 	 * Computer 클래스의 메서드
		 * circle() - 메서드를 오버라이딩 하고, pi 대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
		 * rect(double) - 정사각형의 넓이 를 리턴
		 * rect(double, double) - 직사각형의 넓이 를 리턴
		 * rect(double, double, double) - 직육면체의 넓이 를 리턴
	 */
	

	double circle(int r) {
		return Math.PI*r*r;
	}
	

	double rect(double a) {
		return a*a;
		
	}
	
	double rect(double a, double b) {
		return a*b;
	}
	
	double rect(double a, double b, double c) {
		return a*b*c;
	}
	
	
}
