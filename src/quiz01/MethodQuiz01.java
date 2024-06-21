package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {  // 호출하는 법 연습해놔
		
		// 1.
		calSum(10,20,30);
		System.out.println(calSum(10,20,30));
		
		// 2.
		calSum2(4); // 얘도 메소드 안에 출력문 없애고 여기를 sysout 출력문 형식으로 바꿔야 함

		// 3.
		copy("A",10); // void형은 이렇게 적어줘야 함
		// System.out.println(copy("A",10)); ????????? 이게 왜 오류날까 -> 메소드 안에 이미 출력문이 포함되어 있기 때문에
		
		
		// 4.
		maxNum(2,7);
		System.out.println(maxNum(2,7));
		
		// 5. 
		abs(-3);
		System.out.println(abs(-3));
		
	}
	
	// 1. 세 매개변수의 합 리턴
	static int calSum(int a, int b, double c) {
		return a+b+(int)c;
	} 
	
	/* 1. 선생님 답
	static double calSum(int a, int b, double c) {
		return a+b+c;
	} 
	*/
	
	// 2. 매개변수가 짝수면 "짝수", 홀수라면 "홀수"
	static String calSum2(int a) {
		String str = "";
		if (a %2 ==0) {
			System.out.println("짝수"); // 정답 : str = "짝수"; , (값이 딱 2개로 떨어질 때만) return "짝수";
		} else {
			System.out.println("홀수"); // 정답 : str = "홀수"; , (값이 딱 2개로 떨어질 때만) return "홀수";
		}
		
		
		return str;
	}
	
	
	
	// 3. 매개변수 int만큼 String 반복 출력
	static void copy(String str, int a) {
		for (int i=1; i<=a; i++) {
			System.out.println(str);
		}
		
	} 
	
	
	
	// 4. 매개변수 2개를 입력받아 큰 수 출력하기
	 static int maxNum(int a, int b) {
		 int max = 0;
		 if (a<b) {
			 max = b;
		 } else {
			 max = a;
		 }
		 
		 
		 return max;
	 }
	// 4. 선생님 답 return a > b ? a : b; 3항 연산식으로 간단하게
	 
	
	// 5. 절대값 리턴
	 static int abs(int a) {
		 if (a<0) {
			 a*=-1;
		 } else {
			 a=a;
		 }
		 
		 return a;
	 }
	 
	 // 5. 선생님 답 return a<0 ? -a : a;
	 
	
}
