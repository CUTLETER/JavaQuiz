package quiz01;

import java.util.Scanner;

public class Quiz22 {
	
	public static void main(String[] args) {
		
		/*
		 * 프로그램이 실행되면 랜덤한 덧셈 문제를 출력해주는데
		 * 이 랜덤한 수의 범위는 1-100 사이의 값이다
		 * 
		 * 사용자가 답안을 입력할 때마다, 정답 또는 오답 카운트가 누적된다
		 * 
		 * 
		 * 출력 예시
		 * ---------------
		 * 53 + 19 = ?
		 * [문제를 그만 풀려면 0을 입력하시오.]
		 * > '답'
		 * "정답입니다"
		 */
		
		Scanner scan = new Scanner(System.in);
		int cnt = 0; // 바깥에 선언해야 계속 누적됨
		int f = 0; // 누적 변수는 무조건 반복문 바깥에
		while (true) {
			int a =(int) ((Math.random()*100)+1); // while문 안에 선언해야 while문 돌아갈 때마다 계속 숫자가 바뀜, 바깥에 선언하면 한번 받은 숫자로 while문만 계속 돌아감
			int b =(int) ((Math.random()*100)+1);
			System.out.println("---------------------------");
			System.out.println(a+" + "+b+" = "+"?");
			System.out.println("문제를 그만 푸시려면 0을 입력하세요.");
			System.out.print(">");
			int n = scan.nextInt();
			if (n == a+b) {
				cnt++;
				System.out.println("정답입니다.");
			} else if (n == 0){
				System.out.println("프로그램 정상 종료");
				System.out.println("정답 : "+cnt);
				System.out.println("오답 : "+f);
				break; // 만약 오답 체크하는 코드가 탈출문 위에 있다면 오답+1 되니까 그때는 입력값과 조건문 사이에 넣을 것, 지금은 탈출문 아래에 있어서 오답+1 안됨
			} else {
				f++;
				System.out.println("틀렸습니다.");
				}
			
		} scan.close();
	}
}
