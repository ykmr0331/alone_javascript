
public class J230213_10 {
//  ch3-13,14 비교 연산자, 문자열의 비교   29강
	public static void main(String[] args) {

	//예제 3-14
		String str1 = "abc";
		String str2 = new String("abc");
		//두 문자열을 비교할 때는  equals()라는 메서드 사용
		//만약 대소문자를 구별하지 않고 비교하고 싶으면 equalsIgnoreCase()를 사용해라
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");//""가 헷갈리지 않도록 안쪽ㅇㄴ \"\"로 감싸준다
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");//%b는 boolean출력
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
				
	}

}
