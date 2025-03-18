import java.util.*;

public class Project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n = sc.nextInt();
        List<Integer> arlist=new ArrayList<>();
        int num[] = new int[n];
        System.out.println("Enter a number");
        for(int i=0;i<n;i++){
            arlist.add(sc.nextInt());
        }
        Collections.sort(arlist);
        int secondMin=arlist.get(1);
        int secondMax=arlist.get(arlist.size()-2);
        System.out.println("Second minimum number is: "+secondMin);
        System.out.println("Second maximum number is: "+secondMax);
    }
}
