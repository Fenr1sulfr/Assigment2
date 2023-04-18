import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ArrayListSecondTask {
    public ArrayListSecondTask(){

    }
    public void  trySecond(){
        ArrayList<Integer> numbers= new ArrayList<>();
        Random r = new Random();

        for(int i=0;i<10;i++){
            numbers.add((int) r.nextInt());
        }
        Collections.sort(numbers);
        System.out.println(numbers.toString());
    }
}
