class J230220_15 {
	public static void main(String args[]) {
		try {
			Exception e = new Exception("고의로 발생시켰음.");//Exception에 예외에 대한 정보가 담겨잇음
			throw e;	 // 예외를 발생시킴
		//  throw new Exception("고의로 발생시켰음.");

		} catch (Exception e)	{
			System.out.println("에러 메시지 : " + e.getMessage());//getMessage는 "고의로 발생시켰음"
			e.printStackTrace(); //두줄 출력되는것, 어디서 예외가 발생하는지 보여줌 
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}
}