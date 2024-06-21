package quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		/*숫자 2개를 입력 받아, 큰 숫자를 출력하는 프로그램 코드를 작성하세요.
		  같은 수라면 0을 출력하면 됩니다*/
		
		Scanner scan = new Scanner(System.in);
		long num1 = scan.nextLong();
		long num2 = scan.nextLong();
		
		if (num1<num2) {
			System.out.println(num2);
		} else if (num1>num2) {
			System.out.println(num1);
		} else {
			System.out.println(0);
		}
		
		// num1==num2, num1<num2 조건으로도 가능함
		
		scan.close();
		
		
	}
}
