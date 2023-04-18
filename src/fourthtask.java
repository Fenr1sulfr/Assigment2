import java.util.LinkedList;

public class fourthtask {
    public LinkedList<Integer> task4(LinkedList<Integer> test){
        for (int i = 0; i < test.size(); i++) {
            for(int j=0;j<test.size();j++){
                if(test.get(i).equals(test.get(j))){
                    test.remove(j);
                }
            }
        }
        return test;
    }
}
