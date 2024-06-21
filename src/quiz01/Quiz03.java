package quiz01;

public class Quiz03 {

	public static void main(String[] args) {
		
		int bucket = 10; // 바구니의 크기
		int apple = (int)(Math.random()*150)+1; // 사과의 개수
		System.out.println(apple);
		
		// 사과의 개수가 정해질 때 3항 연산식을 이용해서 필요한 바구니의 개수를 구해라
		
		//사과의 개수를 바구니로 나눌 때 나머지가 0 이면 몫으로
		//나머지가 0 아니면 몫+1로
		
		//내가 적은 답
		//int result  = apple % bucket == 0 ? apple / bucket : (apple / bucket) + 1;
		//System.out.printl(result);
		
		//정답
		//System.out.println(apple % bucket == 0 ? apple / bucket : (apple / bucket) + 1 );
		
		
		// if-else 쓴 답
		int result;
		if (apple % bucket == 0) {
			result = apple / bucket;
		}
		
		else {
			result = (apple / bucket) + 1;
		}
		
		System.out.println(result);
		
		
	}
}
