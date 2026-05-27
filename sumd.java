public class sumd{
    public static void main(String[] args) {
        int sum = 0;
        int n=198;
        while(n>0)
        {
            int digit = n%10; // Get the last digit
            sum += digit; // Add the digit to the sum
            n = n/10; // Remove the last digit
        }
        System.out.println("Sum of digits: " + sum);
    }
}