package quiz15;

import java.util.Scanner;

public class TryQuiz02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		int x = (int)((Math.random()*100)+1);
		
		while (true) {

			try {
					System.out.println("1과 100 사이의 값을 입력하세요.");
					int n = scan.nextInt();
					if (x == n) {
						System.out.println("정답입니다.");
						break;
					} else if (x < n) {
						System.out.println("더 작은 수를 입력하세요.");
						cnt++;
					} else if (x > n) {
						System.out.println("더 큰 수를 입력하세요.");
						cnt++;
					} 
				
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다.");
				scan.nextLine();
				
			} 
		} System.out.println("시도 횟수 : "+cnt);
		
		
		
	
		
		
		
	}

}
