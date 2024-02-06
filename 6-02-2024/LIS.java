import java.util.Scanner;

public class LIS {
    public static int lis(int []arr,int i,int prev_ind,int n){
         if(i==n){
            return 0;
         }
         //not take
         int len = 0 + lis(arr,i+1,prev_ind,n);
         //take
         if(prev_ind ==-1 || arr[i]>arr[prev_ind]){
             len = Math.max(len,1 + lis(arr, i+1, i, n));
         }
         return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        System.out.println("enter the elements of the array: ");
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println(lis(arr,0,-1,n)); 
       sc.close();
    }
}
