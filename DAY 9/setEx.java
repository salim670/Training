import java.util.HashSet;
import java.util.Set;

class setEx {
    public static void main(String[] args){
        Set<Integer> s = new HashSet<>();
        int[] arr = {1,2,3,11,2,3};
        for(int i=0; i<arr.length; i++){
        if(s.contains(arr[i])){
            System.out.println("Duplicate element: " + arr[i]);
        } else {
        s.add(arr[i]);
        }
    }
    
}
}
