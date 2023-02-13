
public class J230213_21 {
 // ch4-15 중첩 for문  37강
	public static void main(String[] args) {
		
		//예제 4-11 중첩 for문
		
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=i; j++) {//  요거 밑에서 설명할게
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
//i = 1일 떄 j = 1          1개
//i = 2일 떄 j = 1,2        2개 
//i = 3일 떄 j = 1,2,3      3개
//i = 4일 떄 j = 1,2,3,4    4개
//i = 5일 떄 j = 1,2,3,4,5  5개
