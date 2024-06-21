package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		my_string	overwrite_string	s	result
		"He11oWor1d"	"lloWorl"	2	"HelloWorld"
		"Program29b8UYP"	"merS123"	7	"ProgrammerS123"
		
		문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
		문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
		문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		*/
		
		Scanner scan = new Scanner(System.in);
		String answer = "";
		String my_string = scan.next();
		String overwrite_string = scan.next();
		int s = scan.nextInt();
		answer += my_string.substring(0, s);
		answer += overwrite_string;
		
		if (my_string.length() - s+overwrite_string.length() > 0) {
			answer += my_string.substring(s+overwrite_string.length());
		}
		 
		System.out.println(answer);
		
		
	}
	
}
