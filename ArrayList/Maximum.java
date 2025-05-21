import java.util.*;

public class Maximum {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(list.get(i),max);
        }
        System.out.print(max);
        // o(n) time
    }
    
}
