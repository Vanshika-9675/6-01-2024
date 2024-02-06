import java.util.Scanner;

public class StringWithaAndb {
    public static boolean check(String str,int i,boolean flag){
          if(i==str.length()){
            return flag;
          }
          flag=true;

          //conditions
          if(i+2==str.length() && str.charAt(i)=='a' && str.charAt(i+1)=='b'){
            return false;
          }
          if(i+2<str.length() && str.charAt(i)=='a' && str.charAt(i+1)=='b' && str.charAt(i+2)!='b'){
             return false;
          }
          if(i+2<str.length() && str.charAt(i) == 'b' && str.charAt(i+2)!='a'){
            return false;
          }
          
          return check(str,i+1,flag);

    }
    public static void main(String[] args) {
          //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        boolean flag = false;

        //first condition check
        if (str.charAt(0)!='a') {
           System.out.println(flag);
           sc.close();
           return;
        }

       flag = check(str,0,flag);
       System.out.println(flag);
       sc.close();
    }
}
