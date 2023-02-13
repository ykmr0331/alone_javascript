import java.util.Scanner;

public class J230213_17 {
	//ch4-5~8 if-else if문, 중첩 if문  33강
	public static void main(String[] args) {
		
		// //에제 4-5 중첩 if문 예제 
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력해주세요.>");
		
		Scanner scanner =new Scanner(System.in);
		score = scanner.nextInt();// 화면을 통해 입력받은 점수를 score에 저장
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		}else if (score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}
}
