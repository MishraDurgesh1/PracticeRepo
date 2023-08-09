package Feb17;

import java.util.LinkedList;
import java.util.List;

public class Third {
    public static void star(){
        for(int i=0;i<=4;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

   public static void star2(){
        for (int i=1;i<=4;i++){
            for (int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
   }
   public static void star3(){
        for (int i=1;i<=5;i++){
            for (int j=4;j>=i;j--) {
                System.out.print(" ");
            }
                for (int k=i;k<=i;k++){
                    System.out.print("*");
                }
            System.out.println();
            }
   }
    public static void main(String[] args) {
        star();
        System.out.println("------------");
        star2();
        System.out.println("-----------");
        star3();
        System.out.println("-----------");
    }

}
