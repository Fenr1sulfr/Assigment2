import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListThirdTask {
    public void trythird() {
        ArrayList<String> names = new ArrayList();
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<3;i++){
            names.add(i, scan.next());
        }
        Collections.sort(names);
        System.out.println(names.toString());
    }
    public ArrayListThirdTask(){

    }
}
