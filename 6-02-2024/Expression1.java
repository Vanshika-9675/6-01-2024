import java.util.Scanner;
/**
 * Expression1
 */
public class Expression1 {
    //recursive function
public static double helper(int k,int i,float res){
    if(i>k){
        return res;
    }
    double val = (float)Math.pow(2,i);
    double ans =  (double)(1/val);
    return ans +  helper(k, i+1, res);
}
    public static void main(String[] args) {
        //Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the k :");
        int k = sc.nextInt();
        //recursive function call
        double res = helper(k,0,0);
        //printing result and rounding of value upto 5 places
        System.out.println(String.format("%.5f", res));
        sc.close();
    }
}