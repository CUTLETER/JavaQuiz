package quiz20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너로 읽을 파일명을 확장자 포함 입력받기
		 * 
		 * 2. upload 폴더에 파일이 있다면 이 파일을 uploadcopy로 복사할 것
		 * 	  파일이 없으면 "파일명이 없습니다" 예외구문을 출력할 것
		 */
		Scanner scan = new Scanner(System.in);
		
		String file = scan.next();
		
		String inputPath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\"+file;
		String outputPath = "C:\\Users\\user\\Desktop\\course\\java\\uploadcopy\\"+file;
		
		InputStream ios = null;
		OutputStream fos = null;
		
		try {
			 ios = new FileInputStream(inputPath);
			 fos = new FileOutputStream(outputPath);
			 
			 byte[] arr = new byte[100];
			 
			 int result;
			 while ((result = ios.read(arr)) != -1) {
				 fos.write(arr, 0, result);
			 } 
			 
		} 
		catch (FileNotFoundException e) {
				e.printStackTrace();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ios.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
