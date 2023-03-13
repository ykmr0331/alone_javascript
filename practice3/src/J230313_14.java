//3-5 변형

//변수 num의 값에 따라 '양수','음수',0을 출력하는 코드다. 삼항연산자를 이용해서 (1)에 알맞은 코드를 넣으시오
import java.util.Scanner;								//Scanner클래스를 사용하기 위해 추가
class J230313_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		//Scanner클래스의 객체 생성
		
		System.out.println("정수를 하나 입력해주세요.>");
		
		String input = scanner.nextLine();				//입력받은 내용을 input에 저장
		int num =Integer.parseInt(input);				//입력받은 내용을 int타입의 형태로 변환
		
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : 0));
	}

}
