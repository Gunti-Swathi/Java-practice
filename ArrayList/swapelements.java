import java.util.*;

public class swapelements {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int i1=1;
        int i2=2;
        list.set(i1,list.get(i1)+list.get(i2));
        list.set(i2,list.get(i1)-list.get(i2));
        list.set(i1,list.get(i1)-list.get(i2));


        // int temp=list.get(i1);
        // list.set(i1,list.get(i2));
        // list.set(i2,temp);
        System.out.print(list);
    }
}
