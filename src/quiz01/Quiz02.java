package quiz01;

public class Quiz02 {

	public static void main(String[] args) {
		
		/*
		 * 0~10 범위의 랜덤한 정수를 생성하고, 5에서 빼주면 범위는 -5~5가 된다
		 * 이 값을 가지고 3항 연산식을 이용해서 절대값(언제나 양수값)을 출력해라
		 * 
		 */
		
		//내가 적은 답
		//int d = (int)(Math.random()*10)-5; 
		//int result = (d < 0) ? -d : d;
		//System.out.println(result);
		
		
		int r = (int)(Math.random()*11)-5;
		System.out.println("절대값 " + (r < 0 ? (-r) : r) );
		
	}
}
