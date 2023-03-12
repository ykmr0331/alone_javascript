
import java.util.*;

class J230310_02 {
	public static void main(String[] args) {
		final int[]	 TIME_UNIT = {3600, 60, 1};	//큰 단위를 앞에 놓는다.
		final String[] TIME_UNIT_NAME = {"시간","분", "초", };
		
		Calendar time1	= Calendar.getInstance();
		Calendar time2	= Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);  //time1을 10시 20분 30초로 설정
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);  //time2을 20시 30분 10초로 설정  
		time2.set(Calendar.MINUTE, 30);                                 
        time2.set(Calendar.SECOND, 10);    
        
        Calendar dt = Calendar.getInstance();
        System.out.println(new Date(dt.getTimeInMillis()));
        
        dt.clear();// 모든 필드를 초기화 1970년 
        System.out.println(new Date(dt.getTimeInMillis()));
        
        Calendar dt2 = Calendar.getInstance();
        System.out.println(new Date(dt.getTimeInMillis()));
        
        dt.clear(Calendar.SECOND);
        System.out.println(new Date(dt2.getTimeInMillis()));
        dt.clear(Calendar.MINUTE);
        System.out.println(new Date(dt2.getTimeInMillis()));
        dt.clear(Calendar.HOUR_OF_DAY);
        System.out.println(new Date(dt2.getTimeInMillis()));
        dt.clear(Calendar.HOUR);
        System.out.println(new Date(dt2.getTimeInMillis()));
        
        System.out.println("time1 : "+time1.get(Calendar.HOUR_OF_DAY) + "시" + time1.get(Calendar.MINUTE) + "분" +time1.get(Calendar.SECOND) + "초");
        System.out.println("time2 : "+time2.get(Calendar.HOUR_OF_DAY) + "시" + time2.get(Calendar.MINUTE) + "분" +time2.get(Calendar.SECOND) + "초");
	
        long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis())/1000;
        System.out.println("time1과 time2의 차이는" + difference + "초입니다.");
        
        String tmp = "";
        for(int i = 0; i < TIME_UNIT.length; i++) {
        	tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i];
        	difference %= TIME_UNIT[i];
        }
        System.out.println("시분초로 변환하면" + tmp + "입니다.");
        
	}
}
