package quiz01;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		/*
		 * up-down 게임
		 * 1-100 까지 임의의 숫자를 하나 생성한다. {정답 값이라고 가정하고}
		 * 스캐너를 통해서 값을 입력받고
		 * 랜덤 수가 입력받은 값보다 적으면 "더 작은 수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰 수를 입력하세요"
		 * 정답을 맞추면 시도 횟수를 출력하고 종료하면 된다.
		 */
		Scanner scan = new Scanner(System.in);
		int x = (int)((Math.random()*100)+1); // while문 안에서 선언하면 계속 숫자가 바뀌니까 특정 숫자 맞히는 게임 룰에서 어긋남
		int tr = 0; // 누적 변수는 늘 밖에다
		while (true) {
			System.out.print(">");
			int n = scan.nextInt();
			if (n == x) {
				System.out.println("정답!");
				System.out.println("총 시도 횟수 :" + tr);
				break;
			}
			if (n < x) {
				tr++;
				System.out.println("더 큰 수를 입력하세요.");
			} else if (n > x) {
				tr++;
				System.out.println("더 작은 수를 입력하세요.");
			} 
			}
			
			
			scan.close();
		}
		
		
	}
