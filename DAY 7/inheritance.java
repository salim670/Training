public class inheritance {
    String name;
    int age; 
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }       
}
public class student extends inheritance {
    String grade;
    public void display() {
        super.display(); // Call the display method of the parent class
        System.out.println("Grade: " + grade);
    }
}
class object {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Alice";
        s1.age = 20;
        s1.grade = "A";
        s1.display();       
    }
}