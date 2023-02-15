class Data2 { int x; }

class J230215_04 {                                    //J230215의 클래스가 메모리에 로드되고 J230215의 클래스의 main 매서드가 호출되면서 프로그램은 시작된다.   
	public static void main(String[] args) {
		Data2 d = new Data2();		//Data클래스의 메모리가 로드되고 Data타입의 참조변수 d가 main메서드의 지역변수로 생성된다. Data클래스의 인스턴스가 생성되고, 생성된 인스턴스의 주소가 참조변수 d에 저장된다.
		d.x = 10;									//참조변수 d가 가리키고 있는(참조하고있는) 인스턴스의 멤버변수 x에 10을 저장한다.
		System.out.println("main() : x = " + d.x);// println메스드를 호출해서 d.x값을 출력한다. 

	change(d);									//change메서드를 호출하면서 매개변수로 참조변수 d를 넘겨준다.main 메서드의 참조변수 d의 값(Data인스턴스 주소)은 change메서드의 매개변수 d에 복사된다. 15로 간다.
													
		System.out.println("After change(d)");	//17에서 돌아와서 change메서드의 수행이 끝났으므로 change 메서드가 사용하던 공간은 호출스택에서 제거되고 다시 main 메서드로 돌아가 change를 호출한 다음 문자이 수행된다.  
		System.out.println("main() : x = " + d.x);//print 메스드를 호출해서 d.x의 값을 출력한다. d.x.의 값은 1000이므로 "main(): x = 1000"을 출력한다.
	}

	static void change(Data2 d) { // 참조형 매개변수, main 메서드의 참조변수 d의 값(Data인스턴스 주소)은 change메서드의 매개변수 d에 복사된다.
		d.x = 1000;									//change 메서드의 지역변수인 참조변수 d가 가리키고 있는 인스턴스 멤버변수 x에 1000을 저장한다.
		System.out.println("change() : x = " + d.x); //println메서드를 호출해서 d.x.값을 출력한다.  다시 9로 돌아간다.
	}
}