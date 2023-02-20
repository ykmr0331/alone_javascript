import java.awt.SystemColor;

//예제 8-4예외의 발생과 catch블럭
public class J230220_14 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);//0으로 나눠서 고의로 ArithmeticException을 발생시키다.
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
		System.out.println("ArithmeticException");
	} catch (Exception e) {//ArithmeticException을 제외한 모든 예외가 처리된다.
		System.out.println("Exception");
	}//try catch문의 끝.
	System.out.println(6);
	}//main 메서드의 끝
}
