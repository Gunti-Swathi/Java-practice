import java.util.*;

public class lonely {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums); // Step 1: Sort the list
        ArrayList<Integer> list = new ArrayList<>();

        // Step 2: Check middle elements
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }

        // Step 3: Check edge cases (first and last elements)
        if (nums.size() == 1) {
            list.add(nums.get(0));
        } 
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size() - 1)-1>nums.get(nums.size() - 2)) {
                list.add(nums.get(nums.size() - 1));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 6, 5, 8));
        ArrayList<Integer> lonelyNumbers = findLonely(nums);
        System.out.println("Lonely numbers: " + lonelyNumbers);
    }
}


//     public static boolean calculate(ArrayList<Integer> list, int tar){
//         for(int i=0;i<list.size();i++){
//             if(list.get(i)==tar){
//                 return false;
//             }
//         }
        
//         return true;
//     }
//      public static void main(String args[]) {
       
//         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,6,5,8));
//         ArrayList<Integer> list1 = new ArrayList<>();


//         Collections.sort(list);
//         for(int i=0;i<list.size()-1;i++){
//             if(list.get(i)!=list.get(i+1)){
//                 if(calculate(list,list.get(i)+1) && calculate(list,list.get(i)-1)){
//                     list1.add(list.get(i));

//                 }

//             }
//         }
//         if(list.get(list.size()-1)!=list.get(list.size()-2)){
//             if(calculate(list,list.get(list.size()-1)+1) && calculate(list,list.get(list.size()-1)-1)){
//                     list1.add(list.get(list.size()-1));

//                 }

//         }
//         System.out.print(list1);

//     }
// }
