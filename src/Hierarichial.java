class One{
	void Print_one() {
		System.out.println("one");
	}
}
class Two extends One{
	void Print_Two(){
		System.out.println("two");
	}
}
class Three extends One{
	void Print_Three(){
		System.out.println("Three");
	}
}
class Four extends One{
	void Print_Four(){
		System.out.println("Four");
	}
}
public class Hierarichial {
	public static void main(String args[]) {
		Two two = new Two();
		two.Print_one();
		two.Print_Two();
		Three three = new Three();
		three.Print_one();
		three.Print_Three();
		Four four = new Four();
		four.Print_one();
		four.Print_Four();
		
		
	}

}
