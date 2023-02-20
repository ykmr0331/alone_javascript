//예제 8-3 예외의 발생과 catch블럭
public class J230220_13 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
	
		try {
			System.out.println(3);
			System.out.println(0/0);// ←0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
			System.out.println(4);  //실행되지 않는다.
		} catch (Exception e) {     //ArithmeticException대신 Exception을 사용
			//모든 예외클래스는 Exception클래스의 자손이므로 어떤 종류의 예외가 발생해도 처리된다.
			System.out.println(5);
		}	//try catch의 끝
	
		System.out.println(6);
	}//main메서드의 끝

}
