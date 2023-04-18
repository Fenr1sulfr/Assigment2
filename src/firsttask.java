import java.util.LinkedList;

public class firsttask {
    public LinkedList<Integer> link1(LinkedList<Integer> list){
        int index=list.size()/2;
        for (int i =0; i < index; i++) {
            list.removeFirst();
        }
        return list;
    }
}
