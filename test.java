import java.util.Scanner;    
class Test
{
    public static void main(String[]args){
       
        //System.out.println(i++ + ++i);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        if (a%2==0)
        {
            System.out.println("This number is even number");
        }
        else{
            System.out.println("This number is odd number");
        }
}
}