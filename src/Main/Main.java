package Main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		String str = scan.next();
		int n = scan.nextInt();
		char[] crr = str.toCharArray();
		System.out.println(Arrays.toString(crr));
		for (int i=0; i<crr.length; i++) {
			if (i %n == 0) {
				System.out.print(crr[i+1]);
			}
		}
		
	}

}
