//예제 8-9
class J230305_26 {
	public static void main(String[] args) throws Exception {
		method1();
	}
	
	static void method1() throws Exception { // 객체 생성없이 호출가능
		method2();
}	//method1의 끝

	static void method2() throws Exception {
		throw new Exception();
	}		//method2의 끝
}// 결론적으로 계속 떠넘긴거임, 예외를 처리하지 못해서 계속 떠넘기다가 그냥 비정상적으로 종료되어버린것이다.