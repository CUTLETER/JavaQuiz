package quiz01;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		/*
		    숙제내용
			어떤 수 x가 주어질 때 x까지의 수 중 소수들의 합을 출력해주세요.
			
			소수?
			소수는 약수가 1과 자기자신인 수 입니다.
			
			예시
			5 까지의 소수합은 2 + 3 + 5 = 10 입니다
			6 까지의 소수합은 2 + 3 + 5 = 10 입니다
			7 까지의 소수합은 2 + 3 + 5 + 7 = 17 입니다
			숙제힌트
			중첩반복을 사용해야 하는문제.
			어떤 값이 소수인지 확인해서 더한다. 
		 */
		
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt(); // 5

			int sum = 0;

			for (int i=1; i<=x; i++) { // 디버깅 (코드 맨앞에 점 찍고 벌레 누른다음 F6, 중지 후엔 - 오른쪽 벌레 옆에 커피 땅콩 누르기) 

				int cnt=0;// 약수 검사하기 전에 cnt값이 0으로 초기화 되어야 함 그래야 cnt가 2인 정수만 거를 수 있음-> 바깥에다 선언하면 cnt가 계속해서 누적됨

				for (int j=1; j<=i; j++) { // 2 - 12, 3 - 123, 4 - 1234, 5 - 12345

					if (i%j==0) {

						cnt++;}

				} 	// <- 이 반복문 돌고 나오면 약수의 개수가 누적됨
				
				if (cnt==2) { // 누적된 개수로 조건문 통과시키기
					
						sum+=i; 
				}
				
			} System.out.println(sum);
			
		
		/*
		int x=3;
		int cnt=0;
		for (int i=1; i<=x; i++) {
			if (x%i==0) { //i는 약수
				cnt++;
			}
		}
		
		System.out.println(cnt == 2 ? "소수" : "소수 아님");
		*/
		
			scan.close();
		
		
	}
}
