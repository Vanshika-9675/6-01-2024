import java.util.Scanner;

public class SumOfDigits {
    //recursive function
    public static int sum(int n,int res){
         if(n==0){
            return res;
         }
         res+= n%10;
        return sum(n/10,res);
    }
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //recursion call
        int res = sum(n,0);

        System.out.println(res);
        sc.close();
    }
}
