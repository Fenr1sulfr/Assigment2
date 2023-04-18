import java.io.File;
import java.io.IOException;
import java.util.*;

public class ArrayList7 {
    public ArrayList7() {

    }


    public void test7(ArrayList<pupil> list) {
        try {
            File file = new File("students.txt");
            if (file.createNewFile()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String tempname = scanner.next();
                int tempGrade=scanner.nextInt();
                pupil students = new pupil(tempname,tempGrade);
                list.add(students);
            }
            Collections.sort(list);
            System.out.println(list.toString());
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
