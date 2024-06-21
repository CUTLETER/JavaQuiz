package quiz01;

import java.util.Scanner;

	public class Quiz04 {
		
	    public static void main(String[] args) {
	    	
	    	Scanner scan = new Scanner(System.in);
	    	
	    	int applecnt = scan.nextInt();

	    	if (applecnt >= 0) {
	          
	            System.out.println("사과의 개수 * 10 은 " + (applecnt * 10));
	        } else {
	            
	            System.out.println("0개 이상 입력하세요");
	        }

	       
	        scan.close();
	      
	        
	    }
	}
	                

