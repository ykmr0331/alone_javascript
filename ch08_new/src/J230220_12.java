//예제 8-2 try-catch문에서의 흐름
public class J230220_12 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(0/0);//←0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
			System.out.println(2); //실행되지 않는다.
		} catch (ArithmeticException ae) {
			System.out.println(3);
		} //try catch문의 끝
		System.out.println(4);
	} //main메서드의 끝

}
