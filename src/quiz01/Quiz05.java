package quiz01;

import java.util.Scanner;

public class Quiz05 {
	
	public static void main(String[] args) {
		
		/*
		 * 스캐너를 활용해서 이름과 나이를 입력받음
		 *
		 *20세 이상이면 "성인입니다."
		 *19세 이하라면 "미성년자입니다."
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름은? >");
		String name = scan.next();
		
		System.out.print("나이는? >");
		int age = scan.nextInt();
		
		
		System.out.println("이름은 " + name + "이며");
		System.out.println("나이는 " + age + "살이다.");
		
		
		if (age >=20 ) { System.out.println("성인이다.");
		
		} else { System.out.println("미성년자다.");
			
		}
		//System.out.println(age >=20 ? "성인이다." | "미성년자다.");
		
		scan.close();
		
		
	}

}
