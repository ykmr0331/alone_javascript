
public class J230214_12 {

	
	//예제 5-8  2차원 배열의 초기화 예제 1
	public static void main(String[] args) {
		int[][] score = {
				  { 100, 100, 100 }
				, { 20, 20, 20 }
				, { 30, 30, 30 }
				, { 40, 40, 40 }
		};
		int sum = 0;

		for (int i = 0; i < score.length; i++) {//score.length는 4임 위에서부터 아래로 4개니까
			for (int j = 0; j < score[i].length; j++) {//여기서 score[i].length는 3이지 
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

				sum += score[i][j];
			}
		}

		System.out.println("sum=" + sum);
	}
}
