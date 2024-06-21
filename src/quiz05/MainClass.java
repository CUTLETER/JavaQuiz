package quiz05;

public class MainClass {

	public static void main(String[] args) {
		
		MyAccount myA = new MyAccount();
		
		myA.deposite(5000);
		myA.withDraw(2000);
		
		System.out.println("현재 잔액 : "+myA.getBalance());
	}
	
}
