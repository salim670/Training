public class overridee {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();

        Child c = new Child();
        c.display();
        System.out.println("This is an example of method overriding.");
    }
}

class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the child class.");
    }
}