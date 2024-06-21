package quiz01;

import java.util.Scanner;

public class Quiz17 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		
		int[] arr = {1000, 500, 100, 50, 10};
		/*
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int ch = 0;
	
		while (i<=coin) {
			a = coin /arr[0]; 
			ch = coin % arr[0];
			b = ch / arr[1];
			ch = coin % arr[1];
			c = ch / arr[2];
			ch = coin % arr[2];
			d = ch / arr[3];
			ch = coin % arr[3];
			e = ch / arr[4];
			ch = coin % arr[4];
		i++;
		} System.out.print(arr[0]+" "+a+" "+arr[1]+" "+b+" "+arr[2]+" "+c+" "+arr[3]+" "+d+" "+arr[4]+" "+e);
		*/
		
		//선생님 답
		int i = 0;
		while (i<arr.length) {
		System.out.print(arr[i]+" "+ money / arr[i]+" "); // 몫
		money %= arr[i]; // money = money % arr[i]; // 나머지
		i++;
		}
	
		
		scan.close();
	}
}
