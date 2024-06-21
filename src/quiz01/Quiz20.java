package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		/*
		 * 가로, 세로를 입력받아 사각형을 출력할 것
		 * 단, 윤곽만 출력할 것
		 * 
		 * 힌트 - 첫행, 마지막행, 첫열, 마지막열에 출력하면 됨
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로 >");
		int w = scan.nextInt();
		System.out.print("세로 >");
		int h = scan.nextInt();
		
		/*
		for (int i=1; i<=b; i++) {
				
			for (int j=1; j<=a; j++) {
				
				if (i==1 || i==b) {
					System.out.println("*");
				} else {
				
				if (j==1 || j==a) {
					System.out.println("*");
				} else {
					System.out.println(" ");
				}
				}
				
				
			} 
		}
		*/
		
		
		
		// 선생님 답 
		for(int i = 1; i <= h; i++) { //세로
			for(int j = 1; j <= w; j++) { //가로
				
				if(i == 1 || i == h) { //첫, 마지막 행
					System.out.print("*");
				} else { //나머지 행
					if(j == 1 || j == w) { //첫, 마지막 열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		
		
		
		
		}
	}

