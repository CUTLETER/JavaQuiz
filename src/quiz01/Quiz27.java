package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz27 {

	public static void main(String[] args) {
		
		/*
		 * 사용자에게 수정하고 싶은 이름을 입력 받아서
		 * 해당 이름이 존재하면 수정할 이름을 새롭게 입력 받는다
		 * 
		 * 만약에 값이 없으면  "이름은 존재하지 않습니다"를 출력한다 ----------------------->>>>>>>>>>>> 이거를 스스로의 힘으로 못했음, boolean 연산자를 이용할 것
		 * 
		 * 문자열의 비교
		 * 문자열.equals(비교할 문자열)
		 */
		boolean flag = false; // 찾으면 true로 바뀜
		String[] arr = {"강타","문희준", "토니안", "이재원", "장우혁"};
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 학생의 별명을 입력 >");
		String name = scan.next();
		int targetIndex = 0;
		for (int i=0; i<arr.length; i++) {
			
			if (name.equals(arr[i])) {
				System.out.println(name+"의 별명을 변경합니다");
				System.out.print("무엇으로 >");
				String nickname = scan.next();
				targetIndex = i;
				arr[targetIndex] = nickname;
				flag = true; // 찾으면 true로 바뀜
				break;
			} 
			
		} // ---------------------> 여기까진 했으나 별명을 못 찾은 경우에서 막힘, boolean 선언하고 아래처럼 해결하면 됨
		
		if (flag) {
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("해당 별명은 없습니다");
		}
		
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
