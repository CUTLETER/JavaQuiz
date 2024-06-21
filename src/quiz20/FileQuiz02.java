package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileQuiz02 {

	public static void main(String[] args) {
		
		/*
		 *  빠른 입력을 통해서 사용자로부터 입력 받기
		 * 	사용자가 "그만"을 적을 때까지 입력 받기
		 *  입력 받은 내용을 BufferedWriter 이용해서 파일을 쓰기
		 *  단,
		 * 	사용자가 엔터를 칠 때마다 데이터는 써져야 할 것
		 * 
		 */
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello5.txt";
		
		BufferedReader br = null; 
		BufferedWriter bw = null;
		
		String word;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter(path));
			
			while (true) {
			System.out.print("입력 >");
			word = br.readLine();
			if (word.equals("그만")) {
				System.out.println("입력 끝");
				break;
			} bw.write(word+"\n");
			  bw.flush();
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
