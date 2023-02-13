
public class J230213_02 {
//ch2-15,16 정수형의 오버플로우 21강  62~65쪽
	public static void main(String[] args) {
		short sMin = -32768, sMax = 32767;//short는 부호 있는 정수  -32768~32767
		char cMin = 0,       cMax = 65535;//char는 부호 없는 정수  0~65535
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin - 1 = " + (short)(sMin-1));//부호있는 정수 음수 최솟값(-32768)에서 1을 빼면 오버플로우로 양수 최댓값(32767)이 된다.
		System.out.println("sMax = " + sMax);
		System.out.println("sMax + 1 = " + (short)(sMax + 1));//부호있는 정수 양수 최댓값(32767)에서 1을 더하면 오버플로우로 음수 최솟값(-32768)이 된다.
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)--cMin);  //부호없는 정수 최솟값에서 1을 빼면 오버플로우로 최댓값 65535가 된다.
		System.out.println("cMax = " + (int)cMax);      
		System.out.println("cMax+1 = " + (int)++cMax);  //부호없는 정수 최댓값에서 1을 더하면 오버플로우로 최솟값 0이 된다.
		//잠깐!!!!
		/*
		  논리형 boolean(1byte)
		  문자형              char(2byte)
		  정수형 byte(1byte) short(2byte) int(4byte) long(8byte)
		  실수형                        float(4byte) double(8byte)
		  
		 */
	}

}
