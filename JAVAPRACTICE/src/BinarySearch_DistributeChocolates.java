import java.util.*;

import javax.print.DocFlavor.STRING;
public class BinarySearch_DistributeChocolates {

    static boolean DistributionPossible(int arr[],int max,int stu){  // time complexity = O(n)
        int student=1;
        int chocolates=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]>max){
                return false;
            }
            if(chocolates+arr[i]<=max){
                chocolates+=arr[i];
            }
            else{
                student++;
                chocolates=arr[i];
            }
            i++;
        }

        if(student <= stu){
            return true;
        }
        else{
            return false;
        }
    }

    static int ans=-1;
    static int DistributeChocolates(int arr[],int st,int en,int stu){    // total time complexity O(nlogN)
        if(arr.length<stu){
            return ans;
        }
        if(st>en){
            return ans;
        }
        int mid=st+(en-st)/2;
        if(DistributionPossible(arr, mid, stu)==true){
            ans=mid;
            return DistributeChocolates(arr, st, mid-1, stu);
        }
        else{
            return DistributeChocolates(arr, mid+1, en, stu);
        }

    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Number of boxes : ");
        int b=scn.nextInt();

        int arr[]=new int[b];
        System.out.println("Chocolates in boxes : ");
        for(int i=0;i<b;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("Number of students to distribute : ");
        int s=scn.nextInt();

        System.out.println("Minimum maximum number of chocolates of distribution are : "+DistributeChocolates(arr,1,(int)1e9,s));
    }
}
