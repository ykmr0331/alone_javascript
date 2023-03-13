import java.util.*;

//예제 11-10
class J230313_02 {
	public static void main(String[] args) {
		Set set = new HashSet();
		//set의 크기가 6보다 작은 1~45사이의 난수 저장
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);	//LinkedList(Collection c), set의 모든 요소를 리스트에 저장	, set은 정렬 불가하므로
		Collections.sort(list);				//Collections.sort(List list)   정렬하고
		System.out.println(list);			//리스트 출력

	}

}
