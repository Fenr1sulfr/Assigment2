import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        int[] head = {1, 2, 3, 4, 5, 6};
        LinkedList<Integer> temple = new LinkedList<>();
        for (int i = 0; i < head.length; i++) {
            temple.add(head[i]);
        }
//        firsttask task1=new firsttask();
//        System.out.println(task1.link1(temple));

//          secondtask s2=new secondtask();
//        LinkedList<Integer> empty=new LinkedList<>();
//        System.out.println(s2.task2(temple));
//        System.out.println(s2.recursionTask2(temple,temple.size()-1,empty));


//        int[] testing ={7,7,7,7};
//        LinkedList<Integer> fortest=new LinkedList<>();
//        for (int i = 0; i < testing.length ;i++) {
//            fortest.add(testing[i]);
//        }
//        fourthtask task4=new fourthtask();
//        System.out.println(task4.task4(fortest));

        int[] testing = {1, 1, 2};
        LinkedList<Integer> fortest = new LinkedList<>();
        for (int i = 0; i < testing.length; i++) {
            fortest.add(testing[i]);
        }
        fifthtask taskN5=new fifthtask();
        taskN5.method(fortest);
    }
}
