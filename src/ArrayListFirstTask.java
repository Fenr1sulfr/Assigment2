import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFirstTask {
     public void tryfirst() {
         ArrayList<String> names = new ArrayList();
         Scanner scan = new Scanner(System.in);
         for (int i=0;i<3;i++){
             names.add(i, scan.next());
         }
         System.out.println(names.toString());
    }
     public ArrayListFirstTask(){

    }
}
