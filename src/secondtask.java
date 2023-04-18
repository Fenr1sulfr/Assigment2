import java.util.LinkedList;

public class secondtask {
    public LinkedList<Integer> task2(LinkedList<Integer> temple) {
        LinkedList<Integer> temp = new LinkedList<>();
        for (int i = temple.size() - 1; i >= 0; i--) {
            temp.add(temple.get(i));
        }
        return temp;
    }

    public LinkedList<Integer> recursionTask2(LinkedList<Integer> temple, int size, LinkedList<Integer> empty) {
        if(size<0){
            return empty;
        }
        empty.add(temple.get(size));
        return recursionTask2(temple,size-1,empty);
    }
}
