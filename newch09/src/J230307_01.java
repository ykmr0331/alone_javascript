
//예제 9-1
 class J230307_01 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}	//main

}

class Value {
	int value;
	
	Value(int value) {
		this.value = value; 
	}

//if(v1.equals(v2))가 true가 나오게 하려면  이렇게
		//Object의 equals()를 오버라이딩해서 주소가 아닌 Value를 비교함
 	public boolean equals(Object obj) {
// 		return this==obj;  //주소비교. 서로 다른 객체는 	항상 거짓
 							//그런데 서로 다른 객체라도 값이 같으면 참을 만들고 싶은것.
 	//참조변수의 형변환 전에는 반드시 instanceof로 확인해야함.
// 		이유는 참조변수가 object타입이기 때문에 어떤 객체든 들어올 수 있기 떄문에 확인해야한다.
 		if(!(obj instanceof Value)) return false;
 		
 		
 		Value v = (Value)obj;   // obj를 value로 형변환
 								//obj에 value가 없으니까	
 		return this.value==v.value;
 	}
}