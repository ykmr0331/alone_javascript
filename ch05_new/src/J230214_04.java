import java.util.Arrays;

public class J230214_04 {
//ch5-1~3 배열의 생성과 선언, 배열의 인덱스
	public static void main(String[] args) {

	int[] score = new int[5]; //길이가 5인 int 배열

	for (int i=0; i <=4; i++) {
		score[i] = i * 10;
		System.out.println(score[i]);
	}
	int tmp = score.length; //score배열의 길이를 구하는것
	
	System.out.println();
	System.out.println(tmp);
	
	
	int[] score2 = new int[]{50,60,70,80,90};
	int[] score3 = {50,60,70,80,90};	//new int[]를 생략할 수 있음
	
	System.out.println(Arrays.toString(score2));
	System.out.println(Arrays.toString(score3));
	
	/*
	 근데 이렇게는 안된다.
	 
	  int[]	score;
	  score = {50, 60,70, 80, 90};        //에러발생, new int[]를 생략할 수 없음
	  */
	 
	// score = new int[]	{50, 60, 70, 80, 90};  이건 가능
	
	
//p.135 배열의 출력
	int[] iArr = {100, 95, 80, 70, 60};
	System.out.println(Arrays.toString(iArr));
	for(int j = 0; j < iArr.length; j++) { //배열의 요소를 순서대로 하나씩 출력
		System.out.println(iArr[j]);
	}
	//예외적으로 char배열은 println메서드로 출력하면 각 요소가 구분자 없이 그대로 출력된다.
	char[] chArr = {'a', 'b', 'c', 'd'};
	System.out.println(chArr);  //abcd가 출력된다.
	
	
	  
	 

	}
}
