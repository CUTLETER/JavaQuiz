package quiz01;

import java.util.Scanner;

public class Quiz19 {
	
	public static void main(String[] args) {
		
		/*	두 수 사이의 합
			숙제내용
			정수 2개를 입력 받습니다.
			
			이 정수 사이의 합을 구해주세요.
			
			예를들어
			1 5가 입력되면 1 + 2 + 3 + 4 + 5 = 15 입니다
			5 1가 입력되면 1 + 2 + 3 + 4 + 5 = 15 입니다
			
			만약 같은 수라면 0이 출력 됩니다.
		*/
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int sum=0;
		if (a>b) {
			for (int i=b; i<=a; i++) { // i값을 여느 때처럼 1로 잡으면 음수 값 들어갔을 때 오류남
				sum+=i;
			} System.out.println(sum);
		} else if (b>a) { 
			for (int i=a; i<=b; i++) {
				sum+=i;
			} System.out.println(sum);
		} else {
			System.out.println(0);
		}
		
		
		/* 선생님 답
		int max = 0;
		int min = 0;
		int sum = 0;
		
		if (a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		for (int i= min; i<=max; i++) {
			sum+=i;
		} System.out.println(sum);
		-> 이러면 같은 값을 때 반례 생겨서 수정해야 함
		-> System.out.println(max == min ? 0 : sum); if문을 또 추가하거나 아님 이처럼 3항 연산법으로 해결
		*/
		
		scan.close();
	}
}

