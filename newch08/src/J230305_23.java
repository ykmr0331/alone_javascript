//예제 8-6 예외 발생시키기
class J230305_23 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음");
			throw e;	//예외를 발생시킴
			//throw new Exception("고의로 발생시켰음");  → 위의 두줄을 한줄로 줄여 쓸 수 있다.
		} catch (Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			//printStackTrace : 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
		}
		System.out.println("프로그램이 정상종료되었음.");
	}
}
