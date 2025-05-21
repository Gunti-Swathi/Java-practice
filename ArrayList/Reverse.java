import java.util.*;
public class Reverse {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        // o(n) time

        }
        // Sort in ascending order;
        Collections.sort(list);
        System.out.print(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.print(list);



    }
    
    


    
}
