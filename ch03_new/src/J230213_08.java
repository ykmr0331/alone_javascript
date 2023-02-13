
public class J230213_08 {
//ch3-9,10 사칙 연산자, 산술변환  27강
	public static void main(String[] args) {

	//예제 3-6 사칙연산자
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
			//%d는 정수 %f는 실수
		
	//예제 3-7 산술변환
		//두 피연산자의 타입을 같게 일치시킨다.(보다 큰 타입으로 일치)
		//피연산자의 타입이 int보다 작은 타입이면 int로 변환된다.
		System.out.println(5/2);
		System.out.println(5/(float)2);
		
	//예제 3-8
		byte c = 10;
		byte d = 30;
		byte e = (byte)(c*d);  //(c*d)가 int형으로 바뀌기 때문에 앞에 (byte)를 입력해줘야 한다. int값을 byte로는 못넣기 때문에
		System.out.println(e);
		
	//예제 3-9
		int f = 1_000_000; //1백만
		int g = 2_000_000; //2백만
		
		long h = f * g; //a*b = 2,000,000,000,000  나올것 같지만 a*b는 int타입이기 때문에 다른값이 나온다.
		System.out.println(h);  //int의 범위는 (-2^(31) ~ 2^(31)-1) 약 +-20억이다.
	
	//예제 3-10
		long j = 1_000_000 * 1_000_000;
		long k = 1_000_000 * 1_000_000L;
		
		System.out.println("j="+j); 
		System.out.println("k="+k);   //우측항에 롱타입으로 하나 바꿔서 제대로 나옴
	}

}
