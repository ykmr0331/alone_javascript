
public class J230214_07 {

	public static void main(String[] args) {
		//예제 5-3
		int[] score = { 79, 88, 91, 33, 100, 55, 95 }; 

		int max = score[0]; // 배열의 첫번째 값으로 최대값을 초기화한다. 
		int min = score[0]; // 배열의 첫번째 값으로 최소값을 초기화한다.

		for(int i=1; i < score.length;i++) {//배열의 두번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화했다.
			if(score[i] > max) {		//최댓값 바꾸려고 
				max = score[i]; 
			} else if(score[i] < min) { //최솟값 바꾸려고
				min = score[i]; 
			} 
		} // end of for 

		System.out.println("최댓값:" + max);       
		System.out.println("최솟값:" + min);       
	} // end of main 
} // end of class
