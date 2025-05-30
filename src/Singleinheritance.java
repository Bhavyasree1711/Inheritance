class Dog{
	void eat() {
		System.out.println("eating");
		}
	void bark() {
		System.out.println("barking");
		}
}
class Puppy extends Dog{
	void sleep() {
		System.out.println("sleeping");
		}
	
}
public class Singleinheritance {
	public static void main(String[]args) {
		Puppy p = new Puppy();
		p.sleep();
		p.bark();
		p.eat();
	}

}
