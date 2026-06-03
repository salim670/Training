public class override2 {
    public static void main(String[] args) {
        vehicle v1 = new vehicle();
        v1.start();

        bike b1 = new bike();
        b1.start();

        car c1 = new car();
        c1.start();

        bus bus1 = new bus();
        bus1.start();

    }

    
    
}
class vehicle {
    void start() {
        System.out.println("Vehicle is starting safely");
    }
}
class bike extends vehicle {
    void start() {
        System.out.println("Bike is starting safely");
    }
}
class car extends vehicle {
    void start() {
        System.out.println("Car is starting safely");
    }
}
class bus extends vehicle {
    void start() {
        System.out.println("Bus is starting safely");
    }
}
