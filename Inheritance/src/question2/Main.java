package question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animals = new Animal[3];
		
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Tiger();
		
		for(Animal i : animals) {
			i.eat();
			i.walk();
			i.makeNoise();
		}
	}

}
