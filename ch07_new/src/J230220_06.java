//예제7-14 내부 클래스의 제어자와 접근성 예제 3

class Outer {
	private int outerIv = 0;
	private static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv; //외부클래스의 private멤버도 접근가능하다.
		int iiv2 = outerCv;
	}

	static class StaticInner {
//		스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근한 수 없다.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;  //값이 바뀌지 않는 변수는 상수로 간주
		final int LV = 0; //JDK1.8부터 final 생략 가능
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
// 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
//			int liv3 = lv;
			int liv4 = LV; //ok
		}
	}
}
