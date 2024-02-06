import java.util.Scanner;

public class MulUsingAdd {
    
    public static int multiply(int m,int n,int res){
        if(n==0){
            return res;
        }
        res+=m;
        return multiply(m, n-1, res);
    }
    public static void main(String[] args) {
          //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int m= sc.nextInt();
        
        System.out.println("Enter second number: ");
        int n= sc.nextInt();
        int res = multiply(m,n,0);
        System.out.print("multiplication: ");
        System.out.println(res);
        sc.close();
    }
}
