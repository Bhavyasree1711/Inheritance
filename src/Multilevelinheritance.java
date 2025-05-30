class Animal{
	void eat() {
		System.out.println("eating");
		}
	void sleep() {
		System.out.println("sleeping");
		}
}
class Doggy extends Animal{
	void bark() {
		System.out.println("barking");
		}
	
}
class puppy extends Doggy{
	void play() {
		System.out.println("playing");
		}
}


public class Multilevelinheritance {
	public static void main(String[]args) {
		puppy p = new puppy();
		p.eat();
		p.bark();
		p.sleep();
		p.play();
	}
		
	}


