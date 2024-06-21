package quiz08;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 2개 User객체를 생성하세요.
		 * 3. User배열에 두 객체를 저장하세요.
		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
		 */
			User u1 = new User("유선화", 123123, 50);
			User u2 = new User("김철수", 234234, 20);
			
			User[] user1 = new User[2];
			user1[0] = u1;
			user1[1] = u2;
			
			for (User uu : user1) {
				System.out.println(uu); // 이럼 주소값 나오는데 쓸모 없음, 값을 뽑아내야 함
				System.out.println(uu.getName()+"-"+uu.getAge()+"-"+uu.getRrn());
			}
			
			
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 *	  Scanner를 User안에 쓰라는 의미 아님 - Main에서 입력 받음
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 	
		*/
			
		User[] user2 = new User[5];
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (i<user2.length) {
			String name = scan.next();
			int age = scan.nextInt();
			int rrn = scan.nextInt();
			User u3 = new User(name, age, rrn);
			user2[i] = u3;
		} System.out.println(Arrays.toString(user2));
			
		
		
		
		
	}
	
	
	
}
