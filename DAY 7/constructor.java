public class constructor {
    String name;
    int age; 
    constructor (){
        name = "Default";
        age = 20;
    }
    constructor(String n, int a) {
        name = n;
        age = a;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}
public class obj {
    public static void main(String[] args) {
        constructor c1 = new constructor();
        c1.display();
        
        constructor c2 = new constructor("Alice", 25);
        c2.display();
    }
}
