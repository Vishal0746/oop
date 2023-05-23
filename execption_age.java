class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student2 {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student2(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        validateName(name);
        validateAge(age);
        this.course = course;
    }

    // Validate age within range
    private void validateAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21");
        }
        this.age = age;
    }

    // Validate name for any numbers or special symbols
    private void validateName(String name) throws NameNotValidException {
        if (name.matches(".*\\d.*") || !name.matches("^[a-zA-Z ]+$")) {
            throw new NameNotValidException("Name contains numbers or special symbols");
        }
        this.name = name;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

// Main class
public class execption_age {
    public static void main(String[] args) {
        try {
            // Create a valid student object
            Student2 student1 = new Student2(1, "John Doe", 18, "Computer Science");
            System.out.println("Student 1: " + student1.getName());

            Student2 student2 = new Student2(2, "Jane Smith", 22, "Electrical Engineering");
            System.out.println("Student 2: " + student2.getName());
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
