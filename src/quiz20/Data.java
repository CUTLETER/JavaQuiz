package quiz20;

import java.util.ArrayList;
import java.util.List;

import quiz17.UserVO;

public class Data {

	
		String name;
		String age;
		String email;
		String area;
		

		
		public Data() {
		}

		public Data(String name, String age, String email, String area) {
			super();
			this.name = name;
			this.age = age;
			this.email = email;
			this.area = area;
			
		}
		
			

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
			
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		@Override
		public String toString() {
			return "정보 [이름=" + name + ", 나이=" + age + ", 이메일=" + email + ", 지역=" + area + "]";
		}
	
		
	
}
