import java.util.*;
public class max_profstocks{
    public static void calculate(int a[]){
        int max_profit =0;
        int cost_price = Integer.MAX_VALUE;
        for(int i =0; i<a.length;i++){
            if(cost_price < a[i]){//a[i] = todays selling price
                int profit = a[i]- cost_price;
                max_profit = Math.max(profit,max_profit);
            } 
            else{
                cost_price = a[i];
            }
        }
        System.out.println("maximum profit is: "+max_profit);
  
    }
    public static void main(String args[]){
        int stocks[] = {7,1,5,3,6,4};
        calculate(stocks);
    }

}