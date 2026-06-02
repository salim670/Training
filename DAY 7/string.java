public class string {
    public static void main(String[] args) {
        String s="Fly me to the moon   ";
        int count=0;
        int i = s.length() - 1;
        while (i>=0 && s.charAt(i)== ' '){ 
            i--;
        }       
        while (i>=0 && s.charAt(i)!= ' '){    
            count++;
        }
        System.out.println("Number of characters in the last word of  string: " + count);
    }
    
}
