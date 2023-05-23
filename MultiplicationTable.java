import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input a number: ");
            int number = input.nextInt();
            
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
        }
    }
}
