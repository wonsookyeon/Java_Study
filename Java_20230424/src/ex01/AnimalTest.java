package ex01;


class Cat{
	void sound() {
		System.out.println("야옹~야옹~");
	}
}

class Dog {
	void makeSound() {
		System.out.println("멍멍~멍멍~");
	}
}

class Pig{
	void sound() {
		System.out.println("꿀꿀~꿀꿀~");
	}
}

class Rabbit{
	void makeSoung() {
		System.out.println("토끼~토끼~");
	}
}

public class AnimalTest {

	// 고양이-야옹, 강아지-멍멍, 돼지-꿀꿀.....짖는 소리
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.makeSound();
		
		Pig pig = new Pig();
		pig.sound();
		
		Rabbit rabbit = new Rabbit();
		rabbit.makeSoung();
		

	}

}
