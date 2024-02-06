import java.util.Scanner;

public class ZeroCount {
    public static int count(int n,int res){
        if(n==0){
            return res;
        }
        if(n%10 == 0){
            res++;
        }
        return count(n/10,res);
    }
    public static void main(String[] args) {
           //taking input
           System.out.println("Enter the number:");
           Scanner sc = new Scanner(System.in);
           int n= sc.nextInt();
           System.out.println(count(n,0));
           sc.close();

    }
}
