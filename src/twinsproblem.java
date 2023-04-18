import java.util.ArrayList;
import java.util.LinkedList;

public class twinsproblem {
    public int findtwins(LinkedList<Integer> list){
        LinkedList<Integer> finalist=new LinkedList<>();
        for (int i = 0; i < list.size()/2; i++) {
            finalist.add(i,(list.get(i)+list.get(list.size()-1-i)));
        }
        int max=0;
        for (int i = 0; i < finalist.size(); i++) {
            if(max<finalist.get(i)){
                max=finalist.get(i);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] testing = {4,2,2,3};
        LinkedList<Integer> fortest = new LinkedList<>();
        for (int i = 0; i < testing.length; i++) {
            fortest.add(testing[i]);
        }
        twinsproblem twin = new twinsproblem();
        System.out.println(twin.findtwins(fortest));
    }

}
