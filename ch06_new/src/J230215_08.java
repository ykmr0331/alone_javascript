//예제 6-11 기본생성자

class Data_1 {
	int value;
	// 여기는 정의되어 있는 생성자가 아예 없어서 컴파일러가 기본생성자를 알아서 추가함
}

class Data_2 {
	int value;
	//여기에 Data_2(){}를 추가해야 compile error가 발생하지 않는다.
	Data_2(int x) {   // 매개변수가 있는 생성자.
		value = x;
	}
}

class J230215_08 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error발생
	}
}