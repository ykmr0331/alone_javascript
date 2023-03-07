//예제 9-15
class J230307_15 {
	public static void main(String[] args) {
		int i = new Integer("100").intValue();
		//intValue는 static이 아니며 Integer 객체에서 int형 값을 뽑아내는 메소드이다
		int i2 = Integer.parseInt("100");
		Integer i3 = Integer.valueOf("100");//valueOf는 (문자열 → 래퍼클래스)변환
		
		int i4 = Integer.parseInt("100", 2);//parseInt는 (문자열 →기본형)전환
		int i5 = Integer.parseInt("100", 8);
		int i6 = Integer.parseInt("100", 16);
		int i7 = Integer.parseInt("FF",  16);
//		int i8 = Integer.parseInt("FF");//NumberFormatException발생 10진법에서 F는 없다.
	
		Integer i9 = Integer.valueOf("100", 2);  //valueOf는 (문자열 → 래퍼클래스)변환
		Integer i10 = Integer.valueOf("100", 8);
		Integer i11 = Integer.valueOf("100", 16);
		Integer i12 = Integer.valueOf("FF",  16);
//		Integer i13 = Integer.valueOf("FF");  //NumberFormatException발생 10진법에서 F는 없다.
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println("100(2) -> "+i4);
		System.out.println("100(8) -> "+i5);
		System.out.println("100(16) -> "+i6);
		System.out.println("FF(16) -> "+i7);
		
		System.out.println("100(2) -> "+i9);
		System.out.println("100(8) -> "+i10);
		System.out.println("100(16) -> "+i11);
		System.out.println("FF(16) -> "+i12);
	}

}
