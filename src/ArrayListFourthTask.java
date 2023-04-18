import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArrayListFourthTask {
    private int size;
    public ArrayListFourthTask(int size){
        this.size=size;
    }
    public void  try4(){
        ArrayList<Integer> numbers= new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<size;i++){
           numbers.add(scan.nextInt());
        }
        System.out.println(Collections.max(numbers)+" "+Collections.min(numbers));
    }
}
