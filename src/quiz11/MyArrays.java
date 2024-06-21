package quiz11;

public class MyArrays {
	
	/*
	 * Arrays.toString() 메소드 내가 만들기
	 * 
	 * 1. MyArrays는 외부에서 객체로 생성할 수 없어야 됨
	 *	-> 생성자에 접근 제어자를 이용해서 객체 생성하지 못하도록 하기
	 *
	 * 2. 메소드 호출 시에는 static키워드를 이용해서 사용하도록 만들기
	 * 
	 * 3. int[]나 String[]이나 char[] 전달되더라도 동일하게 동작하도록
	 * 	  메소드 오버로딩 시키기
	 *
	 */
	 private MyArrays() {} // private이라 new () 생성XXXX
	 
	 public static String toString(int[] arr) {
		 // 문자열의 합
		 //  [ + 배열요소 +","+배열요소+...]
		 String str = "[";
		 for(int i=0; i<arr.length; i++) {
			str+=arr[i];
			if (i==arr.length-1) break;
			str+=", ";
		 } 
		 str += "]";
		 return  str;
	 }
	 
	 
	 
	 
	 /* 내가 쓴 답 - 고쳐볼 것
	  * 
	 public static String toString(String[] arr) {
		 String str = "";
		 for(int i=0; i<arr.length; i++) {
			str+=arr[i]+","; 
		 } 
		 return "["+str+"]";
	 }
	 public static String toString(char[] arr) {
		 String str = "";
		 for(int i=0; i<arr.length; i++) {
			str+=arr[i]+","; 
		 } 
		 return  "["+str+"]";
	 }
	 */
}
