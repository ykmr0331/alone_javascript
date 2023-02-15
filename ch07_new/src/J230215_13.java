//예제 7-1 클래스 간의 관계 결정하기 

class Tv { //부모 멤버 5개임
	boolean power; // 전원상태(on/off)
	int channel;	// 채널

	void power()       {   power = !power; }
	void channelUp()   {   ++channel;      }
	void channelDown() {   --channel;      }
}

	//자식멤버는 부모멤버 5개 상속 받은거에 2개 추가해서 7개
class SmartTv extends Tv {  // CaptionTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;     // 캡션상태(on/off)
	void displayCaption(String text) {
		if (caption) {   // 캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}

class J230215_13 {
	public static void main(String args[]) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;			// 조상 클래스로부터 상속받은 멤버
		stv.channelUp();			// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;	// 캡션(자막) 기능을 켠다.	       
		stv.displayCaption("Hello, World");
	}
}