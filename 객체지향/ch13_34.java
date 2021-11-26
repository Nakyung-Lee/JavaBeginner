package chapter9;
//인터페이스
interface Mammel{ //포유류
	abstract void bear();//새끼를 낳음 
	//-> 포유류를 구현할 때는 새끼를 낳는다는 기능 꼭 오버라이딩 해야한다. 강제화
}
//추상클래스 인터페이스로 해도 괜찮다
abstract class Fish{
	void swim() {
		System.out.println("물고기는 헤엄치며 움직입니다.");
	}
}
class Whale extends Fish implements Mammel{
	public void bear() {
		System.out.println("고래는 새끼를 낳습니다.");
	}
}
public class ch13_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whale whale=new Whale();
		whale.swim();
		whale.bear();

	}

}
