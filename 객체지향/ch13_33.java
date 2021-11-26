package chapter9;
class Pet{
	int age;
	public void move() {
		System.out.println("슈퍼클래스 move() : 애완동물이 움직입니다.");
	}
}
class Dog extends Pet {	
}
class Bird extends Pet {	
	public void move() {
		//매소드 오버라이딩
		System.out.println("슈퍼클래스 move() : 새가 날아갑니다.");
	}
}
public class ch13_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Bird bird=new Bird();
		
		dog.move();
		bird.move();

	}

}
