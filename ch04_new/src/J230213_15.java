import java.util.Scanner; //Scanner 클래스를 사용하기 위해 추가


public class J230213_15 {
//ch4-1~4 조건문 if문과 if-else문  32강
	public static void main(String[] args) {

	//예제 4-1 : if 조건식 사용해보기
		int score = 80;
		
		if (score > 60) {
			System.out.println("합격입니다.");
		}
		
	//예제 4-2 : 조건식의 다양한 예
		int x = 0;
		System.out.printf("x =%d 일 때, 참인 것은 %n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		x = 1;
		
		System.out.printf("x=%d 일 때, 참인것은 %n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		
	//예제 4-3 : if-else문
		
		System.out.println("숫자를 하나 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int input =scanner.nextInt(); //화면을 통해 입력받은 숫자를 input에 저장
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");			
		} else {// input !=0인 경우
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
	}	
}
