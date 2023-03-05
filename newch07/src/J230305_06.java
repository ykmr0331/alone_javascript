//예제 7-7 
class J230305_06 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;		//car = (car)fe; 에서 형변환이 생략됨
		//car.water();  //이건 컴파일 에러난다. Car타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine)car;  //자손타입 ← 조상타입. 형변환 생략불가
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() { //운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	
	void stip()	{		//멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {	//소방차
	void water()  {
		System.out.println("water!!!");
	}
}