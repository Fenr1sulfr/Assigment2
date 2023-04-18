import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListFinal {
    public void method() {
        try {
            File file = new File("dates.txt");
            if (file.createNewFile()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            Scanner scanner = new Scanner(file);
            ArrayList<date> dates = new ArrayList<>();
            while (scanner.hasNext()) {
                String text = scanner.nextLine();
                String[] parts = text.split(",");
                int day= Integer.parseInt(parts[0]);
                int month =Integer.parseInt(parts[1]);
                int year=Integer.parseInt(parts[2]);
                date newdate=new date(day,month,year);
                dates.add(newdate);
            }
            Collections.sort(dates);
            System.out.println(dates.toString());

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}

