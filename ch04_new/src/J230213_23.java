import java.util.*;
public class J230213_23 {
	//ch4-16~19 while문, do-while문 38강
	public static void main(String[] args) {

		
	//예제 4-15  do-while문
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100) + 1;// 1~100사이의 임의의 수 저장, 참고로 answer는 이미 int형으로 정수임
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while(input != answer);
		
		System.out.println("정답입니다.");
	}

}
