//예제 9-11
class J230307_11 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println("sb == sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		//StringBuffer의 내용을 String으로 변경한다.StringBuffer인스턴스에 담긴 문자열을 비교하기 위해서
		
		String s = sb.toString();//String s = new String(sb);와 같다.
		String s2 = sb2.toString();
		
		System.out.println("s.equls(s2) ?" + s.equals(s2));
	}

}
