
public class J230212_08 {
//	ch2-6 리터럴의 타입과 접미사
	public static void main(String[] args) {
	boolean power = true;
	char ch = 'A';	//캐릭터 타입의 변수에는 하나의 문자만 저장가능,, 하나의 문자는 홑따옴표로 묶어주고
	String str = "ABC"; //여러문자를 저장하려면 String타입의 변수를 사용해야한다, 여러 문자는 큰따옴표로 묶어준다,
						//	물론 하나의 문자를 큰따옴표로 묶을 수도 있다.
	byte b = 127; //정수인데 접미사가 없으니까 int 타입이다.  byte는 리터럴이 없기 때문에   
			  		//byte타입의 변수를 저장할 때는  int타입의 리터럴을 사용한다.
					//대신에 byte타입의 변수가 저장할 수 있는 범위의 값이어야 한다는 제약이 있다. 범위는 -128~127까지
	// byte c = 128;  //127을 넘기 때문에 에러가 난다.
	int i =100; //100앞에 접두사 없으니까 
	int oct =0100; //8진수
	int hex = 0x100; //16진수
	int se = 0b0101; //2진수, 앞에 0b가 2진수 나타냄 
	long l = 10_000_000_000L; //20억 넘으면 long 타입의 변수로 표현해야한다. 끝에 접미사 L붙이고, 20억 넘으니까
	long u = 100; //이거는 끝에 L 안붙여도된다. 20억 안넘으니까
	
	float f = 3.14f; //f는 생략 불가, 생략하면 double타입이 되어버리기 때문이다.
	
	//10.  이거는 10.0을 나타낸다. 
	//.10  이거는 0.10을 나타낸다.  이 두 리터럴 모두 소수점이 있으니까 실수형이고 
							//	접미사가 안붙었으니까 double타입의 리터럴이다.	 double타입은 15자리부터
	//10f 는 실수형리터럴이다. f가 붙었으니까
	//1e3 기호 e(10의 e승)실수형에 사용되기 때문에 실수형이다.  1000.0이랑 같은 의미란다.
	System.out.println(1e3); //1000.0이 나온다
	
	
//변수와 리터럴의 타입 불일치할 경우
	
	//	범위가 '변수 > 리터럴'인경우 ,괜춘해
		// int g = 'A';        // int > char
		// long h = 123;       // long > int
		// double k = 3.14f;   //double > float
	
	//	범위가 '변수 < 리터럴'인경우 ,에러난다.
		//int i = 3000_000_000; 
			//int의 범위(+-20억) 벗어남
		//long h = 3.14f; //long <float
			/*long 타입이 8바이트고 float타입이 4바이트라서 괜찮아보이지만 실수형(float)이 정수형(long)보다
			  훨씬 저장범위가 넓기 때문에 에러가 발생한다.*/
		//float f = 3.14; 
			//double타입의 값(여기서 3.14)을 float타입에 저장하려는 것이기에 에러가 발생한다.
			//float는 오차없이 7자리, double은 15자리!!!!
	
	//byte, short 변수에 int 리터럴 저장 가능
		//byte b = 100; 
			/*OK.100(리터럴의 타입이 int지만 
			 더 좁은 범위(-127~128)byte타입의 변수 b에 저장할 수 있다.
			 단!! byte b =128이 되면 에러가 발생한다.*/
	
	}

}