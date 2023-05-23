abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3;
        return (totalMarks / 300) * 100;
    }
}

class B extends Marks {
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    public double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3 + subject4;
        return (totalMarks / 400) * 100;
    }
}

public class Student_marks {
    public static void main(String[] args) {
        A studentA = new A(80, 75, 90);
        B studentB = new B(85, 70, 95, 80);

        double percentageA = studentA.getPercentage();
        double percentageB = studentB.getPercentage();

        System.out.println("Percentage of marks obtained by Student A: " + percentageA + "%");
        System.out.println("Percentage of marks obtained by Student B: " + percentageB + "%");
    }
}
