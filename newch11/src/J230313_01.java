import java.util.*;

//예제 11-9
class J230313_01 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),  "2", "2", "3", "3", "4", "4"};
		Set set = new HashSet();
		
		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);	//HashSet에 objArr의 요소들을 저장한다.
		}
		
		//HashSet에 저장도니 요소들을 출력한다.
		System.out.println(set);
		
		//HashSet에 저장된 요소들을 출력한다.(Iterator이용)		//Iterator는 컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
