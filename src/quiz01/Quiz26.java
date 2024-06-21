package quiz01;

import java.util.Arrays;

public class Quiz26 {

	public static void main(String[] args) {
		
		// 배열 앞에 data를 추가할 것
		
		int[] arr = {10,20,30,40,50};
		int data = 100;
		
		int[] newArr = new int[arr.length+1];
		
		for (int i=0; i<arr.length; i++) {
			newArr[i+1] = arr[i];
		} System.out.println(Arrays.toString(newArr));
		
		newArr[newArr.length-(newArr.length)] = data;
		
		System.out.println(Arrays.toString(newArr));
		
		
	
		
		
		
		
		
	}
}
