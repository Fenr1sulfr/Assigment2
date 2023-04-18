

import java.util.LinkedList;

public class laststep {

    public int test(LinkedList<Integer> list,int position){
        for (int i = 0, j = list.size(); i < list.size(); i++,j--) {
            if(i==position){
                return list.get(j);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] testing = {1,2,3,4,5,6};
        LinkedList<Integer> fortest = new LinkedList<>();
        for (int i = 0; i < testing.length; i++) {
            fortest.add(testing[i]);
        }
        laststep last=new laststep();
        System.out.println(last.test(fortest,4));
    }
}

