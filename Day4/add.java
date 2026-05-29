public class add {
    public int addTwoNumbers(int a, int b) {
        int c=a+b;
        return c;
        //return a+b;
    }
    public int addTwoNumbers(int a, int b, int c) {
        return a+b+c;
    }   
    static void change(int a) {
        a=10;
        System.out.println("Value of a inside change method: " + a);
    }
    public static void main(String[] args) {
        int b=5;
        System.out.println("outside change method: " + b);
        change(b);
        add obj = new add();
        System.out.println(obj.addTwoNumbers(5, 10));
        System.out.println(obj.addTwoNumbers(5,10,15));
    }
}