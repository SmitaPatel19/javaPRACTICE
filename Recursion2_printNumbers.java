import  java.util.*;
public class Recursion2_printNumbers {
    
    private static void print(int n){

        if(n==0){
            System.out.print(n+" ");
            return;
        }

        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter till which to print: ");
        int n=scn.nextInt();

        print(n);
    }
}
