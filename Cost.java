import java.util.*;
public class Cost{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = pencil+pen+eraser;
        float finalcost = cost + (cost*18/100);
        System.out.println(finalcost);

    }
}
