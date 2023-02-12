
public class J230212_12 {
//ch2-3 변수란? 변수의 선언과 저장
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4, y = 2;
		int tmp;
		tmp = x; //x의 값을 tmp에 저장
		x = y;	 //y의 값을 x에 저장
		y = tmp; //tmp의 값을 y에 저장 
		 
		System.out.println("x =" +x);  //여기서 +는 숫자 앞에 글자를 붙일 때도 사용한다.
		System.out.println("y =" +y);


	}

}

