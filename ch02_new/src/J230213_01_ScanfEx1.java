        //1.import문 추가
import java.util.Scanner;
//import java.util.*; 이렇게 써도 됌

public class J230213_01_ScanfEx1 {
//ch2-14 화면으로부터 입력받기  20강
	public static void main(String[] args) {
		//2.Scanner클래스의 객체 생성
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();//정수를 입력받아서 변수 num에 저장,  그러니까 내가 변수를 console에 입력하는거
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
			//입력받은 내용을 input에 저장
		int num3 = Integer.parseInt(input);
			//입력받은 내용을 int타입의 값으로 변환
		System.out.println(num3);
	}

}
