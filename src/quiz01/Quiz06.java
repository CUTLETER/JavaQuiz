package quiz01;

public class Quiz06 {

	public static void main(String[] args) {
		
		
		/*
		 * Quiz02번의 문제를 if-else구문으로 바꿔보기
		 */
		
		/*
		 * 0~10 범위의 랜덤한 정수를 생성하고, 5에서 빼주면 범위는 -5~5가 된다
		 * 이 값을 가지고 3항 연산식을 이용해서 절대값(언제나 양수값)을 출력해라
		 * 
		 */
		int d = (int)(Math.random()*11)-5;
		System.out.println("랜덤 수 " + d);
		if (d>=0) {
			System.out.println(d);
		} else {
			System.out.println(-d);
		}
		
		/*
		 *  int result;
		if (d<0) {
			result = -d
		} else {
			result = d
		}
		*/
		
		
		
	}
}
