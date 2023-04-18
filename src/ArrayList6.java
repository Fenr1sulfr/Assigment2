import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ArrayList6 {
    public void  ArrayList5(){

    }
    public void test6(ArrayList<String> list){
        try {
            File file = new File("strings.txt");
            if(file.createNewFile()){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String temp = scanner.next();
                list.add(temp);
            }
            ArrayList <String> list2= new ArrayList<>(new LinkedHashSet<>(list));
            System.out.println(list2.toString());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
