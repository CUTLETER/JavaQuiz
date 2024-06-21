package quiz17;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {
	
	public static void main(String[] args) {
		
		
		/* 
		 * 1. 숫자를 저장하는 리스트를 만들고 1-20까지 값을 순서대로 저장하기
		 * 
		 * 2. UserVO를 저장할 수 있는 리스트를 만들고 User객체 3개 저장하기
		 * 
		 * 3. 2번에 저장된 list 안에 이름과 나이를 반복문으로 전부 출력하기 - get으로 먼저 객체 꺼내서 getter로 값을 반환 받기
		 * 
		 * - 객체가 저장된 거라 리스트 -> 객체 -> 객체 안의 값 이렇게 생각해서 뽑아야 함 - 고로 getter로 돌리고 값을 반환 받기
		 * 
		 * 4. 2번에 저장된 list 안에, "홍길동"이 있다면 홍길동 객체의 이름과 나이를 출력하기
		 * 
		 * 5. 2번에 저장된 list 안에, "홍길동"이 있다면 홍길동 객체를 삭제하기 - 삭제할 땐 향상된 for문 쓰면 안됨 - 값이 삭제되면 빈 공간에 뒤에 있는 값이 당겨지는데 삭제는 차례차례 진행돼서 당겨진 위치의 값은 남을 수 있음
		 */
		
		
		List<Integer> list = new ArrayList<>();
		int i=1;
		while(i<=20) {
			list.add(i);
			i++;
		}
		System.out.println(list.toString());
		
		
		List<UserVO> uv = new ArrayList<>();
		
	
 		uv.add(new UserVO("홍길동", 20));
		uv.add(new UserVO("홍길자", 6));
		uv.add(new UserVO("홍길순", 99));

		
		for (int k=0; k<uv.size(); k++) {
			UserVO uvo = uv.get(k);
			System.out.println(uvo.getName()+", "+uvo.getAge());
		}
		
		
		for(int k=0; k<uv.size(); k++) {  // contains 쓸 수 없는게 홍길동이 uv 안에 바로 들어 있는 게 아니라 UserVO라는 보자기 안에 감싸져 있음
			UserVO uvo = uv.get(k);
			if (uvo.getName().equals("홍길동")) {
				System.out.println(uvo.getName()+", "+uvo.getAge());
			}
		}
		
		for (int k=0; k<uv.size(); k++) {
				UserVO uvo = uv.get(k);
			if (uv.get(k).getName().equals("홍길동")) {
				uv.remove(k);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
