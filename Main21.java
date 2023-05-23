import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int grade;
    private List<String> courses;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(String course) {
        courses.add(course);
    }
    
    public void removeCourse(String course) {
        courses.remove(course);
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }
}

public class Main21 {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 10);
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");
        
        student.displayInfo();
        
        System.out.println();
        
        student.removeCourse("Science");
        
        student.displayInfo();
    }
}
