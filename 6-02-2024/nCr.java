import java.util.Scanner;

public class nCr {
    //recursive function
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n= sc.nextInt();
        System.out.print("Enter the r:");
        int r= sc.nextInt();
        int diff = n-r;
       int res=  fact(n)/(fact(r)*fact(diff));
        System.out.println(res);
        sc.close();
    }
}
