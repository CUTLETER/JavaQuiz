package quiz17;

public interface IUserManagement {
	
//	 LQ2 와 UM 사이에 interface 생성해서 연결시켜봄 2
	
	// 클래스가 가져야 하는 추상 메소드 선언
	
	public void insert(String name, int age);
	public void printList();
	public boolean search(String name);
	public boolean delete(String name);
	
}
