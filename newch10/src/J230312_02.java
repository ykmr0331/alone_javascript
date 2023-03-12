//예제 10-7

import java.awt.SystemColor;
import java.text.*;
class J230312_02 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try { 
			Number num = df.parse("1,234,567.89"); //parse 는 문자열을 숫자로 바꿔줘
			System.out.println("1,234,567.89" + " ->");
			
			double d = num.doubleValue();//doubleValue는 Nuber에 저장된 값을 double형의 값으로 변환하여 반환한다.
			System.out.println(d + " ->");
			
			System.out.println(df2.format(num));				
		} catch(Exception e) {}

	}

}
