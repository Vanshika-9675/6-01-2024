import java.util.Scanner;
import java.util.Stack;

public class SortingStack {
    public static void sortStack(Stack<Integer> st){
        if(st.empty())
        {
            return;
        }
        int x = st.pop();
        sortStack(st);
        Stack<Integer> temp = new Stack<>();
        while (!st.empty() && st.peek()>x) {
            temp.push(st.pop());         
        }
        st.push(x);
        while (!temp.empty()) {
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of stack:");
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }
        sortStack(st);
        System.out.println(st);
        sc.close();
    }
}
