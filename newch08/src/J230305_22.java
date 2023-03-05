//예제 8-5
class J230305_22 {
	public static void main(String[] args) {		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);  //예외 발생!!!
			System.out.println(4);	  //실행되지 않는다.	
		} catch (ArithmeticException ae) {
			ae.printStackTrace();   //참조변수 ae를 통해 생성된 ArithmeticException인스턴스에 접근할 수 있다.
			
			//printStackTrace() : 예외 발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
			System.out.println("예외메시지: " + ae.getMessage());
		}	//try-catch문의 끝
		
		System.out.println(6);
	}	//main 메서드의 끝

}
