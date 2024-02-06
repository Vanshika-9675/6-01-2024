import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {
    public static void reverse(Queue<Integer> q){
        if(q.size()==0){
            return;
        }
        int ele=  q.remove();

        reverse(q);
        
        q.add(ele);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the queue");
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        reverse(q);
        System.out.println(q);
        sc.close();
    }
}
