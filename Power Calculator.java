class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

public class Main7 {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        try {
            long result1 = calculator.power(2, 3);
            System.out.println("Result 1: " + result1);

            long result2 = calculator.power(-1, 5); // throws exception
            System.out.println("Result 2: " + result2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
