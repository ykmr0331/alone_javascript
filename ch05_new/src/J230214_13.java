
public class J230214_13 {
//예제 5-9 2차원 배열의 초기화 예제 2
	public static void main(String[] args) {
		 int[][] score = {
				  { 100, 100, 100}
				, { 20, 20, 20}
				, { 30, 30, 30}
				, { 40, 40, 40}
				, { 50, 50, 50}
			};
	// 과목별 총점
	int korTotal = 0, engTotal = 0, mathTotal = 0;
	
	System.out.println("번호  국어  영어  수학  총점  평균 ");
	System.out.println("=============================");
	
	for(int i=0;i < score.length;i++) {
		int  sum = 0;      // 개인별 총점
		float avg = 0.0f;  // 개인별 평균
		
		korTotal  += score[i][0];  //국어의 총점을 구하는 듯
		engTotal  += score[i][1];
		mathTotal += score[i][2];
		System.out.printf("%3d", i+1);//"%3d"에서 숫자 3이 간격을 말하는거네 지금보니까// i+1한거는 번호가 1부터 시작하니까
	
			for(int j=0;j < score[i].length;j++) {// 앞에서 i는 0부터 4까지 for문 반복함
				sum += score[i][j];//이제 개인 총점 구해야지 00 01 02 // 10 11 12 //~40 41 42   
				System.out.printf("%5d", score[i][j]);
			}			// 바로위에 총점을 구하는게 아니라 배열을 만드는거임, 국어 영어 수학 사이간격과 숫자 넣는거임
	
			avg = sum/(float)score[i].length;  // 평균계산  , float한 이유는 평균이 소수점으로 나눠떨어질 수 있기 때문.
			System.out.printf("%5d %5.1f%n", sum, avg);//%5.1f는 float형태라서 f를 넣은것
		}
	
	System.out.println("=============================");
	System.out.printf("총점: %3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
	}