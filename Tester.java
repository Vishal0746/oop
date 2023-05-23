class Arithmetic {
    public int add(int a, int b,int c) {
        return a + b+ c;
    }
}

class Adder extends Arithmetic {
    // Empty body as Adder inherits the add() method from Arithmetic
}

public class Tester {
    public static void main(String[] args) {
        Adder adder = new Adder();
        
        // Printing the superclass name
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        
        // Adding two numbers
        int sum = adder.add(42, 13,20);
        System.out.println("42 + 13 + 20 = " + sum);
        
    }
}
