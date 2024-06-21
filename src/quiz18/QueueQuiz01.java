package quiz18;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueQuiz01 {
	
	public static void main(String[] args) {
		
		Customer[] arr = {
				new Customer("hong", 5),
				new Customer("lee", 4),
				new Customer("john", 1),
				new Customer("홍길동씨", 6),
				new Customer("alen", 2)
		};
		
		// 은행에 번호표를 뽑아서 가지고 있는 랜덤한 Customer 배열이 주어짐 (3번 없음)
		// 번호표 순대로 객체를 출력시킬 것
		
		
		// 배열 -> 컬렉션 형 변환 먼저 하기
		Queue<Customer> queue = new PriorityQueue<>();
//		List<Customer> customer = new Arrays.asList(arr);
		queue.addAll(Arrays.asList(arr));
		
		// 큐 소비
		
		while (queue.isEmpty() == false) {
			System.out.println(queue.poll());
		}
	}

}
