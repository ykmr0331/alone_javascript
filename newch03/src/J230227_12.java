//예제 2-12 p.66
public class J230227_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');// 문자열을 문자로 반환하고, 문자를 숫자로 반환함
		System.out.println('3' - '0' + 1);//문자를 숫자로 반환
		System.out.println(Integer.parseInt("3") + 1);//문자열을 숫자로 변환 Integer.parseInt("int")
		System.out.println("3" + 1);//문자더하기 문자가 되버린다.
		System.out.println((char)(3 + '0'));// 숫자를 문자로 변환하는거임 + '0'
	}

}
