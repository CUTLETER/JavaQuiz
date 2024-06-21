package quiz18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		롤 큐 만들기
		 */
		String[] tiers = {"브론즈", "실버", "골딱이"};
		Random random = new Random();

		Queue<Member> member = new LinkedList<>();
		for (int i = 0; i < 300; i++) {
			int id = member.hashCode(); // ID는 고유한 해시코드값
			
			String tier = tiers[random.nextInt(tiers.length)];
			member.add(new Member(id, tier));
		}
			
		
		///////////////////////////////////////////////////////////
		/////////////////////////여기서 부터 문제/////////////////////
		System.out.println("========현재 게임을 신청한 순서=======");
		System.out.println(member);
		/*
		 * member큐에는 게임을 신청한 순서대로 값이 담기게 됩니다.
		 * 
		 * 게임은 동일한 tier를 가지는 5명씩 한팀을 이루게 됩니다.
		 * 
		 * 예를들어
		 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드 ... 로 신청되었다면
		 * 골드 5명이 먼저 한팀으로 먼저 소비 되어야 합니다.
		 * 
		 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드, 실버, 실버, 브론즈, 실버, 실버 ... 로 신청되었다면
		 * 골드 5명 -> 실버 5명이 소비 되어야 합니다
		 * 
		 * 
		 * 랜덤한 member큐 가 주어질 때, 먼저 소비되어야 하는 팀별로 매칭 팀을 출력해주면 됩니다.
		 */
		
		// 티어별로 나눠 담을 Queue 만들어 주기 1 
		Queue<Member> gold = new LinkedList<>();
		Queue<Member> silver = new LinkedList<>();
		Queue<Member> bronze = new LinkedList<>();
		
		int match = 1;
		
		while(member.isEmpty() == false) { // 원본 큐 소비할 때까지 반복시키면 됨 2
			Member m = member.poll(); //  Queue<Member>에서 값을 뽑아내서 멤버 타입에 담음 3
			
			if (m.getTier().equals("골딱이")) { // 각각 티어에 맞는 큐에 넣어줌 4
				gold.offer(m);
				if (gold.size() == 5) {
					matching(match, gold); // 티어 큐에 5개 쌓이면 방출 6
					match++;
				}
			} else if (m.getTier().equals("실버")) {
				silver.offer(m);
				if (silver.size() == 5) {
					matching(match, silver);
					match++;
				}
			} else if (m.getTier().equals("브론즈")) {
				bronze.offer(m);
				if (bronze.size() == 5) {
					matching(match, bronze);
					match++;
				}
			}
	
		} System.out.println(member);
			System.out.println(gold);
			System.out.println(silver);
			System.out.println(bronze);
		
		
		
/*		 	내가 적은 답 - 티어 별로 분류까지는 해두었음, 나머지는 못함
 
  			while (!member.isEmpty()) {
			if (member.element().getTier().equals("골딱이")) {
				gold.add(member.element());
			} else if (member.element().getTier().equals("실버")) {
				silver.add(member.element());
			} else if (member.element().getTier().equals("브론즈")) {
				bronze.add(member.element());
			}
			 member.poll();
		}   
			System.out.println(gold.toString());
			System.out.println(silver.toString());
			System.out.println(bronze.toString());
			
*/			
		
	}
	
	
	
	
//	소비하는 메소드	5 - 5명이 찼을 때만 전달됨
	public static void matching(int match, Queue<Member> member) { // Queue<Member> member 컬렉션을 매개변수로 받는 법 ***** 많이 쓸 예정
		System.out.println(match + "번째 팀");
		
		while(member.isEmpty() == false) {
			System.out.println(member.poll());
		}
	}
	
	

}
