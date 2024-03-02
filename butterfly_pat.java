public class butterfly_pat{
    public static void main(String args[]){
        //using logic
        //first half---(rows)
        for(int i =1; i<=4;i++){
            //cols and 1st stars
            for(int j =1; j<=i;j++){
                System.out.print(" * ");
            }
            //cols and spaces
            for(int j =1; j<=2*(4-i);j++){
                System.out.print("   ");
            }
            //cols and stars
            for(int j =1;j<=i;j++){
                System.out.print(" * ");
            }

            System.out.println();
        }
         for(int i =4; i>0;i--){
            //cols and 1st stars
            for(int j =1; j<=i;j++){
                System.out.print(" * ");
            }
            //cols and spaces
            for(int j =1; j<=2*(4-i);j++){
                System.out.print("   ");
            }
            //cols and stars
            for(int j =1;j<=i;j++){
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
        //from scratch
//         for(int i =1;i<=4;i++){
//             for(int j =1;j<=i;j++){
            
//                     System.out.print("*");
//                 }
//             for(int j=i+1; j<=8-i;j++){
//                 System.out.print(" ");
//             }
//             // for(int j = 8;j>8-i;j--){
//             //     System.out.print("*");

//             // }
//             for(int j =1;j<=i;j++){
            
//                 System.out.print("*");
//             }
//             System.out.println();
//          }
//         for(int i =4;i<=8;i++){
//             for(int j =1;j<=8-i;j++){
            
//                     System.out.print("*");
//             }
//             for(int j =8-i;j<i;j++){
//                 System.out.print(" ");

//             }
                
            
//             for(int j = 8;j>i;j--){
//                 System.out.print("*");

//             }
            
//             System.out.println();
//         }

//     }
// }



                


