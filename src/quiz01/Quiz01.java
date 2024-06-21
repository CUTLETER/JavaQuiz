package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65 
		
		//아래 값은 몇이 될까요?
		
		System.out.println(y += 10 - x++); // 13 -> x값이 대입 후 마지막에 증가해서 
		System.out.println(x+=2);  //5
		System.out.println( !('A' <= c && c <='Z') ); //false
		System.out.println('C'-c); //2 -> char - char = int
		System.out.println(c+1); // 66 -> +인 '이항 연산' 들어가서 int값
		System.out.println(++c); // A값에서 +1 증가 -> b 또는 66인데 '단항 연산'이라 char 타입 유지 -> b
		System.out.println(c++); // 출력 먼저 되고 그 다음에 증가함
		System.out.println(c);  // 고로 67인 C

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
