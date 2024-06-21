package quiz17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02_copy {
	
	public static void main(String[] args) {
		
//	이 copy본은 내가 작성한 답, 나머지 작업에 선생님이 작성한 답을 응용해야 해서 바꾸지 않고 복사해둠  		
		
		
		// 간단한 회원 정보 관리 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		// 값을 저장할 리스트
		List<UserVO> list = new ArrayList<>();
		
		
		while (true) {
			
			System.out.println("------------------");
			System.out.println("[1.회원등록 2.회원전체보기 3.회원정보검색 4.회원정보삭제 5.프로그램종료]");
			System.out.print("메뉴 >");
			
			int menu = scan.nextInt();
			
			// 조건에 따라서 기능을 나눔
			if (menu == 1) {
				String name = scan.next();
				int age = scan.nextInt();
				list.add(new UserVO(name, age));
				// 스캐너로 이름, 나이를 입력 받아서 User 객체에 저장하고 리스트에 하나 추가하기
			} else if (menu == 2) {
				for (int i=0; i<list.size(); i++) {
					UserVO uv = list.get(i);
					System.out.println(uv.getName()+", "+uv.getAge());
				}
				// list 안에 저장된 모든 회원 정보를 반복문으로 출력하기
			} else if (menu == 3) {
				boolean bool = false;
				String findname = scan.next();
				for (int i=0; i<list.size(); i++) {
					UserVO uv = list.get(i);
					if (uv.getName().equals(findname)) {
						System.out.println(uv.getName()+", "+uv.getAge());
						bool = true;
					} 
				} if (!bool) {
					System.out.println(findname+"님은 없습니다.");
				}
				// 찾을 이름을 입력 받아서 이름이 있다면 이름과 나이를 출력하기
				// 단 찾는 이름이 없으면 "000님은 없습니다"를 출력하기
			} else if (menu == 4) {
				String deletename = scan.next();
				for (int i=0; i<list.size(); i++) {
					if (list.get(i).getName().equals(deletename)) {
					list.remove(i);
					break;
				}
			}
				// 삭제할 이름을 입력 받아서 이름과 동일한 User객체를 삭제하기
				// 단 첫번째로 발견되는 User만 삭제하기
			} else if (menu == 5) {
				System.out.println("프로그램 종료");
				break;
				// 프로그램 종료
				// 또는 System.exit(0);
			}
			
		
		
		
		
		
		}

	}
}
