class J230215_11{
	//예제 6-14 멤버변수의 초기화 예제 1
	
	static {								//					
		System.out.println("static { }");	//클래스 초기화 블럭
}											//		

	{										//	
		System.out.println("{ }");			//인스턴스 초기화 블럭
	}										//	

	public J230215_11() {
		System.out.println("생성자");
	}

	public static void main(String args[]) {
		System.out.println("J230215_11 bt = new J230215_11(); ");
		J230215_11 bt = new J230215_11();

		System.out.println("J230215_11 bt2 = new J230215_11(); ");
		J230215_11 bt2 = new J230215_11();
	}
}
