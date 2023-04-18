import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList9 {
    public void test9(){
        try {
            File file = new File("employee.txt");
            if (file.createNewFile()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            Scanner scanner = new Scanner(file);
            ArrayList<employee> employee= new ArrayList<>();
            int counter=0;
            while (scanner.hasNext()) {
                String text= scanner.nextLine();
                String[] parts=text.split(":");
                String name=parts[0];
                double salary= Double.parseDouble(parts[1]);
                employee tempemploy=new employee(salary, name);
                employee.add(tempemploy);
                counter++;
            }
            int sum=0;
            for (int i = 0; i <counter; i++) {
                sum+=employee.get(i).getSalary();
            }
            System.out.println(sum/counter);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
