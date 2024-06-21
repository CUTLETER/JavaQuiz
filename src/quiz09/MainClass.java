package quiz09;

public class MainClass {
	
	public static void main(String[] args) {
		
		//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
		
		Computer computer = new Computer();
		computer.computerInfo();
		
		Monitor m = computer.getMonitor();
		m.info();
		
	}

}