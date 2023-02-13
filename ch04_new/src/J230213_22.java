import java.util.*;
public class J230213_22 {
//ch4-16~19 while문, do-while문 38강
	public static void main(String[] args) {

	//예제 4-12 while문 예제
		int i = 5;
		
		while(i--!=0) {
			System.out.println(i + " - I can do it."); 
		}
		
	//예제 4-13 
		int sum =0;
		int j = 0;
		// j를 1씩 증가시켜서 sum에 계속 더해나간다.
		while (sum <=100) {
			System.out.printf("%d - %d%n", j, sum);
			sum += ++j;
		}
		
	//예제 4-14를 for반복문으로 표현해보기
		int num = 12345, sum2 =0;
		
		//10으로 나머지 여난을 하면 마지막 자리를 얻는다.
        //system.out.println(12345%10);
		
		//num2 =12345, 1234, 123, 12, 1
		for(num=12345;num > 0; num = num / 10) {
			System.out.println(num%10);
			sum2 += num % 10;
			
			System.out.println("각 자리수의 합:" +sum2);
		}
	
	//예제 4-1
	int num2 = 0, sum3 = 0;
	System.out.print("숫자를 입력하세요.(예:12345)>");
	
	Scanner scanner = new Scanner(System.in);
	String tmp = scanner.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
	num2 =Integer.parseInt(tmp); //입력받은 문자열(tmp)을 숫자로 변환
	
	while(num2 !=0) {
		//num2를 10으로 나눈 나머지를 sum3에 더함
		sum3 += num2 % 10; //sum3 = sum3 + num2 % 10
		System.out.printf("sum3 = %3d num2=%d%n", sum3, num2);
		
		num2 /= 10; //num2 =num2 /10;
	}
		System.out.println("각 자리수의 합:" +sum3);

	}
}
