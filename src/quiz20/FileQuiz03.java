package quiz20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

public class FileQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * 상혁이가 입사한 회사에서는 매일 오전 아침 7시에 연계사(회사)에서
		 * 날짜 유형의 CSV파일을 매일 전송해줌 
		 * ex) 2024_06_04_data.csv +내일이 되면 날짜가 바뀜
		 * 그래서 상혁이는 아침마다 csv파일을 읽어서 우리의 데이터베이스에 저장하는
		 * 프로그램 코드를 생성해야 함
		 * 
		 * buffered 사용해서 오늘 날짜 패턴_data.csv 파일을 읽어서 한 줄에 하나씩 출력하기
		 * 읽은 데이터는 , 구분자로 되어 있는데 , 기준으로 데이터를 분리해서 getter setter를 가지는 Data클래스에 저장하고
		 * 이 객체를 리스트에 저장하기
		 * 
		 * Data클래스 사용하기, Data 객체 생성하기, ArrayList 사용하기
		 */
		

		
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
		String today = sdf.format(date);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\"+today+"_data.csv";
		
		List<Data> list = new ArrayList<>();
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path));
			String info;
			while ((info=br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(info, ",");
				Data data = new Data(); // 각 줄마다 data 객체 생성 돼서 담아야 하는데 밖에다 달랑 하나만 생성하면 첫줄 Alice만 들어가고 끝나버림
				data.setName(st.nextToken()); 
				data.setAge(st.nextToken());
				data.setEmail(st.nextToken()); 
				data.setArea(st.nextToken());
				
				list.add(data);
			} 
			
			for (Data member : list) {
				System.out.println(member);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
