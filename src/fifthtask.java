import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class fifthtask {

    public LinkedList<Integer> method(LinkedList<Integer> test){
        int[] indexes=new int[test.size()];
        int indexForIndexes=0;
        for (int i = 0; i < test.size()-1; i++,indexForIndexes++) {
            for (int j = i; j < test.size(); j++) {
                if(test.get(i)==test.get(j)){
                    indexes[i]=j;
                    System.out.println(test.get(i)+" is duplicate "+test.get(j)+"Indexes:"+i+" "+j);
                }
            }
        }
        for (int i = 0; i < indexes.length; i++) {
            System.out.println(indexes[i]);
        }
//        for (int i = 0; i < indexes.length; i++) {
//            if(indexes[i]>=1){
//                test.remove(indexes[i]);
//            }
//        }
        return test;
    }
    public static void main(String[] args) {
        int[] testing = {1,1,2,3,3};
        LinkedList<Integer> fortest = new LinkedList<>();
        for (int i = 0; i < testing.length; i++) {
            fortest.add(testing[i]);
        }
        fifthtask taskN5=new fifthtask();
        System.out.println(taskN5.method(fortest));

    }
}
