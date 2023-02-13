
public class J230213_05 {
//ch3-5,6 증감연산자, 부호연산자  25강
	public static void main(String[] args) {
	  //예제 3-2
		int i = 5, j =0;
		j = i ++;
		System.out.println("j=i++; 실행 후, i=" + i +", j=" +j);

		i=5; //결과를 비교하기위해, i와 j의 값을 다시 5와 0으로 변경
 		j=0;
 		
 		j = ++i;
 		System.out.println("j=++i; 실행후, i=" + i +",j="+ j);
 		
 		
	}

}
