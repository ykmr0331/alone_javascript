
public class J230212_15_printfEx1 {
//	19강: ch2-12,13 printf를 이용한 출력 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//println()의 단점: 출력형식 지정불가
		System.out.println(10/3); //3이 나오는데 정수 /정수는 정수로 나와서
		System.out.println(10.0/3);//3.3333333333333335나온다
		//실수가 하나라도 있어야 실수로 출력된다.
		
		//println()의 단점: 10진수로만 	출력된다. 
			System.out.println(0x1A); //26
			//16진수 표현법에서 10개의 0,1,2,3,4,5,6,7,8,9 아라비아 숫자와, 나머지 6개의 숫자로 알파벳 문자를 16진수로 사용한다.
			
			//그러면 8진수, 16진수로 출력하려면?
			//printf()로 출력형식 지정가능
			System.out.printf("%.2f", 10.0/3);//3.33
				//%.2f : 소수점 둘째짜리까지 출력
			
			System.out.println();
			
			System.out.printf("%d", 0x1A);//26
				//%d: 10진수 표기
			
			System.out.println();
			
			System.out.printf("%x", 0x1A);//1A
				//%X: 16진수 표기
			
			System.out.println();
			
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			
	System.out.printf("age:%d year:%d\n",14 ,2017);
		//14가 age에 들어가고 2017이 year에 들어간다.
		// '\n'은 개행문자로 다음에 줄바꿈이 된다.
		//따라서 "age:14 year:2017\n"이 화면에 출력된다.
	System.out.println("우리집%n");
		// \n은 os마다 줄바꿈이 아닐수도 있지만 %n은 모든 os에 줄바꿈으로 적용된다.
		//그러므로 줄바꿈은 %n으로 쓰기를 권장한다.
	System.out.println("너네집");
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

//정수를 10진수, 8진수, 16진수로 출력하기
	System.out.printf("%d", 15); // 15 10진수 decimal
	System.out.println();
	System.out.printf("%o", 15); // 17 8진수  octal
	System.out.println();
	System.out.printf("%x", 15); // f  16진수 hexadecimal
	System.out.println();
	System.out.printf("%s", Integer.toBinaryString(15)); 
		// 1111  2진수 binary
	System.out.println();
	
// 8진수, 16진수로 출력하기(접두사 붙여서)
	System.out.printf("%#o", 15); // 017  8진수  octal
	System.out.println();
	System.out.printf("%#x", 15); // 0xf  16진수 hexadecimal
	System.out.println();
	System.out.printf("%#X", 15); // 0xf  16진수 hexadecimal
	System.out.println();
	
// 실수 출력을 위한 지시자: 부동소수점 형식(%f), 지수형식(%e), 간략한 형식(%g)
	float f = 123.4567890f; //마지막 f쓴건 실수형 리터러러에 접미사 붙여야해서
	System.out.printf("%f", f); // 123.456787(소수점아래 6자리)
		//기본적으로 소수점아래 6자리까지 출력
		//6번째 소수점자리는 9가 나와야 되는데 7이나왔다.
		/*float타입은 정밀도가 7자리까지 정확, 즉 123.4567까지만 정확하고 
			89는 정확하게 안나온다는 것이다.
			즉 정밀도에서 벗어난 8번째부터는 의미없는 숫자라는것*/
	
		//그래서 double을 사용하는게 더 적합한것이다.
	System.out.println();
	System.out.printf("%e", f); 
		//1.234568e+02로 나온 이유는 실제 값은 같은데 반올림해서 보여주는것
			//e+02는 10^2를 의미한다. 이제 이해가지?
		System.out.println();
	System.out.printf("%g", 123.456789); //123.457
		System.out.println();
	System.out.printf("%g", 0.00000001); //1.00000e-8
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//실수 정렬?
	double d = 1.23456789;
	System.out.printf("[%5d]%n", 10); //[   10]  10을 5칸 안에 입력하는데 오른쪽으로정렬
	System.out.printf("[%-5d]%n", 10); //[10   ]  10을 5칸 안에 입력하는데 왼쪽으로정렬
	System.out.printf("[%05d]%n", 10); //[00010]  10을 5칸 안에 입력하는데 빈칸을 0으로채워서 정렬
	
	System.out.printf("d=%14.10f%n", d);
		//전체 14자리 중 소수점 아래 10자리
		System.out.println();
	System.out.printf("d=%-14.10f%n", d);
		//전체 14자리 중 소수점 아래 10자리(-붙었으니까 왼쪽정렬) 
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	
	String url = "www.codechobo.com";
		//%s는 문자열로 출력
	System.out.printf("[%s]%n", url);
	System.out.printf("[%20s]%n", url);
	System.out.printf("[%-20s]%n", url);
	System.out.printf("[%.8s]%n", url);
		// www.code 이렇게 8자리까지만 나타냄
	
	
	
	
	
	}			
}
 