
public class J230213_07 {
	//ch3-7,8 형변환 연산자, 자동 형변환  26강
	public static void main(String[] args) {

//예제 3-5
	
	double d = 85.4;
	int score = (int) d;
	System.out.println("score=" + score);
	System.out.println("d=" + d);	//형변환 후에도 피연산자에는 아무런 변화가 없다.
		
//	byte b = 100;      //OK. byte타입의 범위(-128~127)의 값의 대입
//	byte c = (byte)100;//OK. byte타입으로 자동형변환하여 대입

		
//	int i =100;
//	byte d = i; 
		  		/*에러난다. 100이 byte범위(-128~127)안에 들어가지만 
		         i는 변수이기 때문에 에러를 일으킴 */
//	byte d =(byte)i; //OK byte타입으로 형변환하여 대입			
	}

}
