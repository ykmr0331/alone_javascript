
public class J230213_20 {
//ch4-13,14 for문  36강
	public static void main(String[] args) {
	
		
		//예제 4-8 for문
		for (int i = 1; i <= 3; i++) { //괄호{}안의 문장을 3번 반복
			System.out.println("Hello");
		}
		
		//예제 4-9 for문 예제
		for (int j=1; j<=5; j++)
			System.out.println(j); //j의 값을 출력한다.
		
		for (int j=1; j<=5; j++)
			System.out.print(j);  //print()를 쓰면 가로로 출력된다.
		
		System.out.println();
		
		
		//예제 4-9 for문 예제
		int sum = 0;  //합계를 저장하기 위한 변수.
		
		for (int k = 1; k <= 5; k++) {
			sum += k ; //sum = sum + k;
			System.out.printf("1부터 %2d까지의 합: %2d%n", k, sum);
		}
	}
}
