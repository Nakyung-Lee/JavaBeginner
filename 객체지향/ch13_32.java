package chapter9;
class Pet{
	int age;
	public void move() {
		System.out.println("애완동물이 움직입니다.");
	}
}
class Dog extends Pet{ //Pet 클래스 상속 받는 Dog 클래스
	String name; //이름
	int weight; //강아지 무게
	int getWeight() {
		return weight;
	}
}
class Bird extends Pet{ //Pet 클래스 상속 받는 Bird 클래스
	String type; //새 종류
	boolean flightYN; //날 수 있는지 유무
	boolean getFlight() {
		return flightYN;
	}
}
public class ch13_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.age=3;
		dog.name="누렁이";
		dog.weight=10;
		
		Bird bird=new Bird();
		bird.age=5;
		bird.type="앵무새";
		bird.flightYN=true;
		
		dog.move();
		bird.move();
		
		System.out.println("강아지의 이름은 "+dog.name+"고. 몸무게는 "+dog.weight+"Kg 입니다.");
		System.out.println("새의 종류는 "+bird.type+"고. 날 수 "+(bird.getFlight() ? "있" : "없") + "습니다.");
		
	}

}
