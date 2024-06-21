package quiz21;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		String str = "123123-45644 GS25(치킨도시락) 4,400원 or 123123-3453454 GS25(마늘햄쌈) 5,000원 or 123456-3453 GS(갓혜자도시락) 6,000";

//		arr 상품번호, GS25, (상품명), 가격을 정규 표현식으로 나눠서 출력하기
		
		
		String number = "[0-9]{6}-[0-9]{4,}";
		String shop = "[A-Z]+([\\d]+)?"; //
		String product = "\\([^)]+\\)";
		String price = "[0-9]+,[0-9]+원?";

		Matcher m = Pattern.compile(shop).matcher(str);
		while (m.find()) {
			System.out.println(m.group());
		}
		
		
	}
}
