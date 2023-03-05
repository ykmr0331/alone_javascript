//예제 8-4
class J230305_21 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);		//실행되지 않는다.
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)/* instanceof 연산자로 catch블럭을 하나씩 차례로 검사하게 되는데,
			 첫 번쨰 검사에서 일치하는 catch블럭을 찾았기 때문에 두번째 catch블럭은 검사하지 않게 된다.*/
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}	//try -catch의 끝
			System.out.println(6);
	}		//main메서드의 끝
}
