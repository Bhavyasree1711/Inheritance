class Sample {
    // Static block - executes once when the class is loaded
    static {
        System.out.println("Inside the static block");
    }

    // Instance block - executes before the constructor whenever an object is created
    {
        System.out.println("Inside the instance block");
    }

    // Constructor - executes when an object is created
    Sample() {
        System.out.println("Inside the constructor");
    }
}

public class Block {
    public static void main(String args[]) {
        Sample s = new Sample();  // Creating an instance of Sample
    }
}