
public class J230212_10 {
// ch2-7,8 문자, 문자열 리터럴, 문자열 결합
	public static void main(String[] args) {
//	char cch = 'AB'; 에러발생한다. 홑따옴표 안에 두개이상의 문자를 넣을 수 없기 때문이다

//	String name = new String("Java"); 
		
		/*String객체를 생성,
		원래 String은 클래스이므로 객체를 생성하는 new를 사용해야하지만*/
	
		// String name = "Java" 이것도 허용함
	
	// String s = "";  문자열
	// String s = '';  이건 안됌 에러발생함
	// String s1 = "A" + "B";  이건 AB가 됨
	
	//문자열 결합은 왼쪽에서 오른쪽으로 진행됨
	
		char ch = 'A';
		int i = 'A';
		System.out.println(i);
		String str = "";
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		
		System.out.println("" + 7 + 7);
		//문자열 + any type → 문자열
		System.out.println( 7 + 7 + "");
		//any type + 문자열 → 문자열
	}

}
