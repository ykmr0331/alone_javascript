
public class J230213_12 {
	//ch3-15,16 논리 연산자, 논리 부정 연산자  30강
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//예제 3-16
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();
		
		System.out.printf("ch=%c%n", ch);  //%c 문자 출력
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z'); // %b는 불값 출력 ch < 'a' || ch > 'z'는 사실이므로 true를 출력함
		System.out.printf("!('a  <= ch && ch <='z')=%b%n", !('a'<= ch && ch <='z'));
		System.out.printf(" 'a  <= ch && ch <='z')=%b%n", 'a' <= ch && ch <='z');
		
	}

}
