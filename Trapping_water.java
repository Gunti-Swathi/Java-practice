public class Trapping_water{
    public static void calculate(int a[]){
        int total_traped = 0;
        int max_left[] = new int[a.length];
        int max_right[] = new int[a.length];
        max_left[0] = a[0];
        max_right[a.length-1]= a[a.length-1];
        // System.out.println("right"+ max_right[a.length-1]);
        // System.out.println("left"+ max_left[0]);

        for(int i =1;i<a.length;i++){
            if(max_left[i-1] < a[i]){
                max_left[i] = a[i];
            }
            else{
                max_left[i] = max_left[i-1];
            }
            // System.out.print(max_left[i]);

        }
        for(int i =a.length-2;i>=0;i--){
            if(max_right[i+1] < a[i]){
                max_right[i] = a[i];
            }
            else{
                max_right[i] = max_right[i+1];
            }
            // System.out.println();
            // System.out.print(max_right[i]);


        }
        for(int i =0;i<a.length;i++){
            int water_level = Math.min(max_left[i],max_right[i]);
            int trapped_level = water_level-a[i];
            total_traped = total_traped+ trapped_level;

        }
        System.out.println("total trapped water is : "+total_traped);

    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        calculate(height);
    }
}