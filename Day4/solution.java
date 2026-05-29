import java.util.Scanner;
public class solution {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the Target:");
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("the pair is:"+arr[i]+","+arr[j]+" at index "+i+","+j);
                }
                else{
                    System.out.println("no pair found");
                }
            }
        }
    }
    
}
