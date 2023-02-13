
public class J230213_06 {
	//ch3-5,6 증감연산자, 부호연산자  25강
	public static void main(String[] args) {

	//예제 3-3	
		int i =5, j =5;
		System.out.println(i++); //i의 값을 출력 후, 1증가    5
		System.out.println(++j); //j의 값을 1 증가 후 ,출력   6 
		System.out.println("i = " + i + ", j = " +j); //i가 8행에서는 5가 나왔지만 그 후에 1증가를 했으니까 여기서 i를 출력할 때는 6이 나온다.

		
	//예제 3-4  부호연산자
		
		int k = -10;
		k = +k;
		System.out.println(k);
		
		k = -10;
		k = -k;
		System.out.println(k);
		
	}

}
