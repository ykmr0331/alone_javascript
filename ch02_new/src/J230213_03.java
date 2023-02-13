
public class J230213_03 {
//ch2-17 타입간의 변환방법 66쪽
	public static void main(String[] args) {
	String str = "3";
	
	System.out.println(str.charAt(0) - '0');  //3.charAt(0)은 3이다.
	System.out.println('3' - '0' + 1); // 3 + 1 이 된다.
	System.out.println(Integer.parseInt("3") + 1);
	System.out.println("3" + 1);  //이러면 "3" +  "1" 이 되므로 "31"이 된다.
	System.out.println((char)(3 + '0'));// 숫자를 문자로 변환
	System.out.println(3 + '0');//   참고로 '0'은 숫자로 48
	}

}
