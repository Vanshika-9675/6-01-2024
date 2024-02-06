import java.util.Scanner;

public class StringToNumber {
    public static int StoN(String str,int i,int res){
         if(i==str.length()){
            return res;
         }  
         res = res*10;
         res += str.charAt(i)-'0';
         return StoN(str, i+1, res);
    }
    public static void main(String[] args) {
          //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        int res = StoN(str,0,0);
        System.out.println("Here is the output in integer form: ");
        System.out.println(res);
        sc.close();
    }
}
