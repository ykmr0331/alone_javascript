import java.util.*;
public class J230214_01 {
// ch4-20~24 break문, continue문, 이름붙은 반복문
	public static void main(String[] args) {

	
		int sum = 0;
		int i = 0;
		
		while(true) { //for(;;)로 입력해도 나옴
			if(sum > 100)
				break; //자신이 속한 하나의 반복문을 벗어난다
			++i;
			sum += i;
		} //end of while
		
		System.out.println("i =" + i);
		System.out.println(" sum =" + sum);
	
	//예제 4-17
		
		for(int j = 0; j <= 10; j++) {
			if (j%3==0)
				continue;
			System.out.println(j);
		}
	//예제 4-18
		int menu = 0;
		int num = 0;
		
		Scanner scanner =new Scanner(System.in);
				
		while(true) {// 무한 반복문
			System.out.println("(1) square ");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)");
			
			String tmp = scanner.nextLine();  //화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);  //입력받은 문자열 (tmp)을 숫자로 변환
			if(menu ==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if (!(1 <= menu && menu <=3)) {
				System.out.println("메뉴를 잘못선택하셨습니다.(종료는0)");
				continue;
			}
			System.out.println("선택하신 메뉴는" + menu +"번입니다.");
		}
	}
}
