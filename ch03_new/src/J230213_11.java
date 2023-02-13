import java.util.Scanner;

public class J230213_11 {
//ch3-15,16 논리 연산자, 논리 부정 연산자  30강
	public static void main(String[] args) {

	//예제 3-15
		Scanner scanner = new Scanner(System.in);// Scanner클래스의 객체를 생성(p.61쪽)
		char ch = ' ';//ch는 하나의 문자를 가질 수 있다.
		
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();  // nextLine()메소드는 Enter를 치기 전까지 쓴 문자열을 모두 리턴한다는 것
		ch = input.charAt(0);
		
		//현재 charAt(0)이라고 작성했는데 이 말은 str이 가리키고 있는 문자열에서 0번째에 있는 문자를 char타입으로 변환한다는것
		
		if('0'<= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문지는 영문자입니다.%n");
		}
		System.out.println();
		
	}

}
