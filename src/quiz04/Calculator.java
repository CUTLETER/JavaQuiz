package quiz04;

public class Calculator {
	
	/*
	 * Calculator의 멤버변수 int result, double pi를 선언하세요
	 * Calculator의 메서드
	 * add(int) - result에 값을 누적시키는 기능
	 * circle(int) - pi를 이용해서 원의 넓이를 리턴하는 기능  (원의넓이: PI * r * r)
	*/
	
	int result;
	double pi = 3.14;
	
	int add(int a) {
		result+=a;
		return result;
	}
	
	double circle(int r) {
		return pi*r*r;
	}
	
}
