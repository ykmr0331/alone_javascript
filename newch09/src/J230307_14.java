//예제 9-14
class J230307_14 {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println("i ==i2 ? " +(i==i2));
		System.out.println("i.equals(i2) ? " + i.equals(i2));//오버라이딩 되어있다.
		System.out.println("i.compareTO(i2) = " + i.compareTo(i2));
		System.out.println("i.toString()= " + i.toString());
		
		System.out.println("MAX_value=" + Integer.MAX_VALUE);	//+20억
		System.out.println("MIN_value=" + Integer.MIN_VALUE);	//-20억
		System.out.println("SIZE=" + Integer.SIZE +" bits");	//32비트
		System.out.println("BYTES=" + Integer.BYTES +" bytes");	//4바이트
		System.out.println("TYPE=" +Integer.TYPE);
	}

}
