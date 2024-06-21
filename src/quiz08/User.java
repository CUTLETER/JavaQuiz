package quiz08;

import java.util.Scanner;

public class User {
	
	private String name;
	private int rrn;
	private int age; // 여기까지만 직접 치고 나머지는 단축키로
	

	
	public User() { // 컨트롤 + 스페이스
		
	}
	
	public User(String name, int rrn, int age) { // 컨트롤 쉬프트 에스 - 유징 필드
		super();
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}

	public String getName() { // 컨트롤 쉬프트 에스 - 게터 앤 세터
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRrn() {
		return rrn;
	}

	public void setRrn(int rrn) {
		this.rrn = rrn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

