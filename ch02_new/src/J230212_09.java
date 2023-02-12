
public class J230212_09 {
//ch2-6 리터럴의 타입과 접미사
	public static void main(String[] args) {		
		final int score = 100;
		boolean power = true;
		System.out.println(power);
		
		byte b =127; // byte의 범위는-128~127
		
		int oct = 010; //8진수, 10진수로 8
		int hex = 0x10; //16진수, 10진수로 16
		
		System.out.println(oct);
		System.out.println(hex);
		/*println은 값을 10진수로만 출력할 수 있다.
		그리고 접두사와 접미사는 출력하지 않는다.*/
		/*printf를 사용해야 8진수나 16진수로 출력할 수 있다.*/

		long l =10_000_000_000L;
		//long l =10_000_000_000; ERROR 발생!!
			//끝에 정수형 롱타입(20억넘으면) 리터럴 접미사 L,l붙여야한다.
		float f = 3.14f;//f 지우면 에러발생함
		double d = 3.14d;// d 지워도 상관없음,, f를 집어넣어도 에러 안생김 
						 //변수의 타입인 double이 float보다 더 넓은 타입이기 때문이다.
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);//f는 float 타입의 리터럴이므로 소수점까지 나오는거  10.0
		System.out.println(1e3);
	}

}
