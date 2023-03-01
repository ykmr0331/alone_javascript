//예제 6-11
class Data_1{
	int value;
}

class Data_2 {
	int value;
	
	Data_2(int x) { //매개변수가 있는 생성자
		value =x;
	}
}

class J230301_24 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
//		Data_2 d2 = new Data_2();  //compile에러 발생함  이유는 Data1은 위에서 기본생성자가 만들어졌지만 Data2는 위에서 매개변수가 있는 생성자를 만들었기 때문에 기본생성자를 따로 만들어야
	}

}
