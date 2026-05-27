import java.util.Scanner;
public class switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a colour (red,green,yellow): ");
        String s = scanner.nextLine();
        String p;
        switch (s) {
            case "red":
                p = "stop";
                break;
            case "green":
                p = "go";
                break;
            case "yellow":
                p = "ready";
                break;
            default:
                p = "Invalid colour";
        }

        System.out.println("The action is: " + p);
    }
    
}
