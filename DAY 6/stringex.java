public class stringex {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        
        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);
        
        // Substring
        String substring = str.substring(7, 12);
        System.out.println("Substring (7-12): " + substring);
        
        // Replace
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
        
        // Uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);
        
        // Lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);
    }
    
}
