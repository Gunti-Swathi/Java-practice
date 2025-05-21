import java.util.*;

public class pairsumbrute {
    public static boolean calculate(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    
                    return true;
                }
            }
        }
        
        return false;
    }

    public static void main(String args[]) {
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.print(calculate(list, target));
    }
}
