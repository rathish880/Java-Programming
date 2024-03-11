import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);

        Scanner in =new Scanner(System.in);

        // list.add(3);
        // list.add(26);
        // list.add(80);
        // System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
            
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }

    }
}
