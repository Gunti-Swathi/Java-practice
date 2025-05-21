import java.util.*;
public class pairsumoptim {
    public static boolean calculate(ArrayList<Integer> list, int target) {
        int start=0;
        int end=list.size()-1;
        while(start<end){
            if(list.get(start)+list.get(end)==target){
                return true;
            }
            else if(list.get(start)+list.get(end)<target){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int target = 1;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.print(calculate(list, target));
    }
    
    

    
}
