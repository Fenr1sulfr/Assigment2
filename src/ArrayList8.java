import java.io.File;
import java.io.IOException;
import java.util.*;

public class ArrayList8 {
    public ArrayList8(){

    }
    public void test8(String findme){
    try {
        File file = new File("books.txt");
        if (file.createNewFile()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        Scanner scanner = new Scanner(file);
        ArrayList<books> booker= new ArrayList<>();
        int counter=0;
        while (scanner.hasNext()) {
            String text= scanner.nextLine();
            String[] parts=text.split(",");
            String title=parts[0];
            String description=parts[1];
            books book = new books(title,description);
            booker.add(book);
            counter++;
        }
        int index = 0;
        for (int i = 0; i <counter; i++) {
            if(booker.get(i).getName().equals(findme)){
                index=i;
                break;
            }
        }
        System.out.println(booker.get(index).getDescription());

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
