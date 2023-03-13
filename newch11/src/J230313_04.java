//예제 11-12

import java.util.*;

class J230313_04 {
	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A = "+setA);
		
		setA.add("4"); setA.add("5"); setA.add("6");
		setA.add("7"); setA.add("8");
		System.out.println("B = "+setB);
//교집합-----------------
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();//B에서 꺼내
			if(setA.contains(tmp)) //B에 있는 요소들{4, 5, 6, 7, 8}이 A에 있늕 차례대로 확인
				setKyo.add(tmp);		//4,5가 교집합에 들어감
		}
//차집합-------------		
		it =setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
		
//합집합-------------
		
		it =setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		it =setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
//-------------------
		setA.retainAll(setB);	//교집합
		setA.addAll(setB);	//교집합
		setA.removeAll(setB);	//차집합
		
		
		System.out.println("A ∩ B = " + setKyo);//한글 ㄷ을 누르고 한자키
		System.out.println("A ∪ B = " + setHab);//한글 ㄷ을 누르고 한자키
		System.out.println("A - B = " + setCha);//한글 ㄷ을 누르고 한자키
		
		
		
		
		
		
		
		
		
		
	}

}
