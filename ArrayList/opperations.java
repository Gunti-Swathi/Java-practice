import java.util.ArrayList;
public class opperations {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,6);
        System.out.print(list);
        System.out.println(list.get(2));
        list.remove(3);
        System.out.print(list);
        list.set(2,10);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.size());

        // print elements in array list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }



    }
}
