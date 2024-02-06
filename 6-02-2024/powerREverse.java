import java.util.Scanner;

public class powerREverse {
    public static double pow(double n,double r){
        if(r==0){
           return 1;
        }
        //if even power
        if(r%2==0){
            return (pow(n*n,r/2))/10e9;
        }
        //if odd power
        return n*pow(n*n, (r-1)/2)/10e9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
         double n = sc.nextInt();
        System.out.println("Enter the reverse: ");
        double r = sc.nextInt();
        
        double res = pow(n,r);
        System.out.println(res);
        sc.close();
    }
}
