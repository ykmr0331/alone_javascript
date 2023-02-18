//추상메서드 p.257~258
abstract class Player { //추상클래스(미완성 클래스, 미완성 설계도)
	abstract void play(int pos); //추상메서드(미완성 메서드)
	abstract void stop(); //추상 메서드(선언부만 있고 구현부{}가 없는 메서드
}

//추상 클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos +"위치부터 play합니다.");}	
	void stop() {System.out.println("재생을 멈춥니다.");}
/*"'void stop() {System.out.println("재생을 멈춥니다.");}'를 없애면 에러난다. 
 이유는 */
}

public class J230218_07 {

	public static void main (String[] args) {
//		Player p = new Player();//추상 클래스의 객체를 생성 당연히 안됨	 
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); 
		/*다형성때문에 가능 Player ap는 리모컨이라고 생각해라*/
		ap.play(100);
		ap.stop();   

	}
}
