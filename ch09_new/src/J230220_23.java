//예제 9-3 Object 클래스의 메서드-hashCode
public class J230220_23 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
	
		System.out.println(str1.equals(str2));//str1과 str2가 문자열 내용이 같으므로  true가 나온다.
		System.out.println(str1.hashCode());// 이거랑 밑에는  각각 문자열 내용이 같으므로 같은 값이 나온다
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
