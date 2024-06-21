package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. java()
			- 매개변수로 정수를 받음
		 *  - 매개변수 1 -> return "자";
		 *  - 매개변수 2 -> return "자바";
		 *  - 매개변수 3 -> return "자바자";
		 *  - 매개변수 4 -> return "자바자바";
		
		 * 2. sum()
		 * - 매개변수로 정수 1개 받음
		 * - 매개변수의 약수의 합계를 리턴함
		 * - 매개변수 5 -> return 1+5
		 * - 매개변수 6 -> return 1+2+3+6
		 
		 * 3. primeNum()
		 * - 매개변수 2개를 받아서 순서 상관없이 두 수 사이의 합계를 리턴함
		 * - 1,2 -> return 1+2;
		 * - 2,1 -> return 1+2;
		 * - 1,1 -? return 0; 숫자가 같다면 0
		 */
		
		// 1 
		System.out.println(java(8)); // 반환 값이 있으면 출력문으로, 없으면 함수만
		
		// 2
		System.out.println(calSum(6));
		
		// 3
		System.out.println(primeNum(5,4));
	}
	

	
	
	// 1. 
	static String java(int a) {
		String j = "자";
		String v = "바";
		String str = "";
		for(int i=1; i<=a; i++) {
			if (i %2 != 0) {
				str+=j;
			} else {
				str+=v;
			}
			}
		
		
		return str;
	}
	
	
	
	
	
	// 2.
	static int calSum(int a) {
		int sum = 0;
		for (int i=1; i<=a; i++) {
			if (a%i==0) {
				sum+=i;
			}
		}
		
		return sum;
	}
	
	
	
	// 3. 문제 잘못 이해함
	static int primeNum(int a, int b) {
		int sum = 0;
		sum = a+b;
		if (a==b) {
			sum = 0;
		}
		return sum;
	}
	
	
	/* 3.  선생님 답
	static int primeNum(int a, int b) {
		if (a==b) {
		 return 0;   // if (a==b) return 0; 으로도 괄호 없이 축약 가능함
		}
		int max = a>b ? a:b;
		int min = a>b ? b:a;
		for (int i=min; i<=max; i++) {
		sum+=i;
		}
		return sum;
	}
	*/
	
	
	
}
