import java.util.Scanner;

public class AddingStar {
    public static String separateRepeated(String str,String res,int i){
        if(i==str.length()){
            return res;
        }
        if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
            res+=str.charAt(i);
             res+='*';
        }
        else{
            res+=str.charAt(i);
        }
        return separateRepeated(str, res, i+1);
    }
    public static void main(String[] args) {
          //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        String res = "";
        res+= separateRepeated(str,res,0);
        System.out.println(res);
        sc.close();
    }
}
