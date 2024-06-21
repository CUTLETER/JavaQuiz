package quiz19;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz {

	public static void main(String[] args) {
		
		/*1-45까지 중복되지 않는 로또 번호 6개 만들기
		 * 
		 * 1. 랜덤 객체 사용해서 1-45까지 랜덤수를 생성하기
		 * 2. list or set 사용해서 랜덤한 로또 번호 6개 만들기
		 */
		
		 Random random = new Random();
		 Set<Integer> lotto = new TreeSet<>();
		 
		 for (int i=1; i<7; i++) {
			 int number = random.nextInt(45)+1;
			 lotto.add(number);
		 } System.out.println("이번 주 로또 번호 : "+lotto.toString());
		 
		
		
		
	}
}
