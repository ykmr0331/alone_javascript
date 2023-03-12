//예제 10-9

import java.util.*;
import java.text.*;

class J230312_04 {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 mm월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/mm/dd");

		
		try {
			Date d = df.parse("2019년 11월 23일");//parse는 문자열을 날짜로 바꾸는거
			System.out.println(df2.format(d));	//날짜를 문자열로 바꿔주는거임
		} catch(Exception e) {}
	}

}
