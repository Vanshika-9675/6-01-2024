import java.util.Scanner;

public class Palindrome {
    //recursive function
    public static boolean pdrome(String str,int i,int n,boolean flag){
        if (i==n/2) {
            return flag;
        }

        if(str.charAt(i) != str.charAt(n-i-1)){
              return false;
         }
         else{
            flag = true;
         }
        return pdrome(str, i+1, n, flag);
    }
    public static void main(String[] args) {
        //taking user input
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int n = str.length();

        //recursive function call
        boolean flag =  pdrome(str, 0,n, false);
        System.out.println(flag);
        sc.close();
    }
}












