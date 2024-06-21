package quiz03;

public class DmbPhone extends Phone  {
	//DmbPhone은 Phone 클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel 을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
		

	// String color; 부모에서 이미 생성됨
	// String model; 부모에서 이미 생성됨
	int channel;
	
	public DmbPhone(String pModel, String pColor, int pChannel) {
		color = pColor;
		channel = pChannel;
		model = pModel;
	}

	void turnOnDmb() {
		System.out.println("TV를 켭니다.");
	}
	
	int changeChannel (int a) {
		channel = a;
		System.out.println("채널: " + a);
		return channel;
	}
	
	void turnOffDmb() {
		System.out.println("TV를 끕니다.");
	}
	

}
