package quiz21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "헐2,500원 ㅋㅋㅋ 찾아보시지 1,200원 6000원";	// X,XXX원 XXXX원 2가지
		
		String price = "\\d{1}(\\,\\d{3})+[가-힣]|\\d{4}+[가-힣]";
// 		선생님 답안		"[0-9]+,?[0-9]+원";
		
		Matcher m1 = Pattern.compile(price).matcher(str);
		while(m1.find()) {
			System.out.println(m1.group());
		}
		
	}

}
