//예제 8-7

class J230220_16 {
	public static void main(String[] args) {
		try {//Excception과 그 자손은 반드시 예외처리를 해줘야한다(필수)
			throw new Exception();		// Exception을 고의로 발생시킨다.
		}catch(Exception e) {}
		
		//RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 된다.
		throw new RuntimeException();
	}
}