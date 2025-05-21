import java.util.*;
// o(n)
public class pairsumrot {
    public static boolean calculate(ArrayList<Integer> list, int target) {
        int start=0;
        int end=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                start=i+1;
                end=i;
                break;

            }
        }
         while(start!=end){
            if(list.get(start)+list.get(end)==target){
                return true;
            }
            else if(list.get(start)+list.get(end)<target){
                start++;
                if(start==list.size()){
                    start=0;
                }
            }
            else{
                end--;
                if(end==-1){
                    end=list.size()-1;
                }
            }
        }
        return false;
        // while(start!=end){
        //     if(list.get(start)+list.get(end)==target){
        //         return true;
        //     }
        //     else if(list.get(start)+list.get(end)<target){
        //         start=(start+1)%list.size();
        //     }
        //     else{
        //         end=(list.size()+end-1)%list.size();
        //     }
        // }
        // return false;
    }
    public static void main(String args[]) {
        int target = 30;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 15, 6, 8,9, 10));
        System.out.print(calculate(list, target));
    }
    
    

    

    
}
