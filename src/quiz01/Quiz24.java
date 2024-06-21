package quiz01;

public class Quiz24 {

	public static void main(String[] args) {
		
		//***************************************************
		
		
		// 배열이 주어질 때 배열 요소 중에서 가장 큰 값 하나만 출력하기
		int[] arr = {34, 65, 12, 34, 56, 100, 54, 21, 99};
		int max = 0;
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			for (int j = arr.length-1; j>=0; j--) {
			if (arr[i] < arr[j] ) {
				max = arr[j];
			}}
			} System.out.println("가장 큰 값 : "+max);
			
		
			/*
			선생님 답
			
			int max = arr[0];
			
			if(max<arr[i]) {
				max = arr[i];
			}
			*/						
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
