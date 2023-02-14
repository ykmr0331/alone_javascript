
public class J230214_02 {
//ch4-20~24 break문, continue문, 이름붙은 반복문
	public static void main(String[] args) {

	//예제 4-19 이름붙은 반복문
		
			//for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2; i <=9; i++) {
			for(int j=1; j<=9;j++) {
				if(j==5)
					break Loop1;                 //20항으로 가는거임
				//	break;                       //18항을 출력
				//	continue Loop1;				 //19항으로											
				//	continue;					 //17항으로	
				System.out.println(i+"*"+j+"="+i*j);
			}	//end of for i
			System.out.println();
		}		//end of Loop1
	

	}

}
