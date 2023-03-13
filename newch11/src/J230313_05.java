//예제 11-13

import java.util.*;

class J230313_05 {
	public static void main(String[] args) {
		Set set = new TreeSet();		//HashSet은 정렬 안되어서 출력됨
		//TreeSet은 정렬필요없다. 어차피 정렬 되서 출력되니까
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);		//set.add(new Integer(num));
		}
		
		System.out.println(set);

	}

}
