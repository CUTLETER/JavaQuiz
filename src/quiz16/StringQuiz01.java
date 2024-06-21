package quiz16;

import java.util.Scanner;

public class StringQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 공백을 포함한 id를 입력 받기
		 * 2. 공백을 제거한 id가 5글자 미만이면 다시 입력 받기
		 * 3. id는 반드시 소문자이어야 할 것
		 * 
		 * id가 5글자 이상이면 "아이디가 등록되었습니다"를 출력하고 프로그램 종료
		 */

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("아이디 >");
			String id = scan.nextLine();
			id = id.replace(" ", ""); // id = id.replace(" ", "").toLowerCase(); 로 간단하게 적어도 됨
		if (id.length()<5) {
			System.out.println("5글자 이상 입력하세요.");
		} else {
			id = id.toLowerCase();
			System.out.println("아이디 "+id+" 등록되었습니다.");
			break;
			}
		}
	
	
	}

}
