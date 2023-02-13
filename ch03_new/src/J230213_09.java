
public class J230213_09 {
//ch3-11,12 반올림 Math.round(), 나머지 연산자    28강
	public static void main(String[] args) {

	//예제 3-11
		double pi = 3.141592; //소수점 아래 네번째에서 반올림하고 싶다. 즉 소수점 세번째 자리까지만 표현하고 싶다면
		System.out.println(pi * 1000);
		System.out.println((int)(pi * 1000));
		System.out.println((int)(pi * 1000)/1000); //pi * 1000은 3142로 int 형식인데 거기서 1000(int형식)을 나눠주면 int형식이 되므로 3이 나온다.
		System.out.println((int)(pi * 1000)/1000.0);
		System.out.println();
	
	//예제 3-12  나머지 연산자
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y); //printf까먹지말고
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);
	
	//예제 3-13 나머자 연산자
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);
		//나머지 연산자(%)는 나누는 음수도 허용된다. 그러나 부호는 무시되므로 관계없다.
		
	}

}
