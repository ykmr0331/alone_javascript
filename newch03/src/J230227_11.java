//예제 2-11 p.65
public class J230227_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sMin = -32768, sMax = 32767;
		char cMin = 0, cMax = 65535;
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax + 1 = " + (short)(sMax + 1));
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin-1 = " + (int)--cMin);
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMiax + 1 = " + (int)++cMax);
	}

}
