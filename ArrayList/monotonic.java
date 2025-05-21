import java.util.*;

public class monotonic {
    public static boolean monin(ArrayList<Integer> list) {
        boolean inc=true;
        boolean dec= true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                inc=false;

            }
            if(list.get(i)<list.get(i+1)){
                dec=false;

            }

        }
        return inc ||dec;
    }
    // public static boolean mondec(ArrayList<Integer> list) {
    //     for(int i=0;i<list.size()-1;i++){
    //         if(list.get(i)<list.get(i+1)){
    //             return false;

    //         }

    //     }
    //     return true;
    // }
    
    public static void main(String args[]) {
       
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,2,1));
        System.out.print(monin(list));
        // if(monin(list)||mondec(list)){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");

        // }

    }
    
}
