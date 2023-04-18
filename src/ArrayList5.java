import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArrayList5 {
    public void Arraylist5(){

    }
    public double task5(){

        try{
            File numbers = new File("ahaha.txt");
            if(numbers.createNewFile()){
                System.out.println("created");
            }
            else{
                System.out.println("Already exists");
            }
            Scanner scanner = new Scanner(numbers);
            int sum=0;
            int counter=0;
            while(scanner.hasNextInt()){
                int temp = scanner.nextInt();
                sum+=temp;
                counter++;
            }
            return sum/counter;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
