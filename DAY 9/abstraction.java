abstract class vehicle{
    abstract void start();
    public void stop(){
        System.out.println("Vehicle stopped");
    }
}
class car extends vehicle{
    void start(){
        System.out.println("Car started");
    }
}


public class abstraction {
    public static void main(String[] args) {
        vehicle c = new car();
        c.start();
        c.stop();
        
    }
    
}
