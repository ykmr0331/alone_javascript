//예제 6-14
class J230301_27 {
	static {
		System.out.println("static {}");
	}
	
	{
		System.out.println("{}");
	}
	
	public J230301_27() {//생성자
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {//생성자임
		System.out.println("J230301_27 bt =new J230301_27();");  
		J230301_27 bt = new J230301_27();   //인스턴스 생성,  생성자 출력
		
		System.out.println("J230301_27 bt2 =new J230301_27();");  
		J230301_27 bt2 = new J230301_27();                        
		
	}
}
