import java.util.LinkedList;
import java.util.Objects;

public class MyHashMap<T ,J > {
    private LinkedList<T> key=new LinkedList<>();
    private LinkedList<J> value=new LinkedList<>();

    public MyHashMap(){

    }

    public void put(T key, J value) {
        for (int i = 0; i <this.key.size() ; i++) {
            if(this.key.get(i).equals(key)){
                this.value.add(i,value);
                return;
            }
        }
        this.key.add(key);
        this.value.add(value);
    }

    public Object get(T key){
        for (int i = 0; i < this.key.size(); i++) {
            if(this.key.get(i)==key){
                return this.value.get(i);
            }
        }
        return -1;
    }
    public void removePair(T key){
        for (int i = 0; i < this.key.size(); i++) {
            if(this.key.get(i)==key){
                this.key.remove(i);
                this.value.remove(i);
                break;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
       return this.key.equals(o)?true:false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        String temp="";
        for (int i = 0; i < this.key.size(); i++) {
            temp+="["+this.key.get(i)+":"+this.value.get(i)+"]"+'\n';
        }
        return temp;
    }

    public static void main(String[] args) {
        MyHashMap<Integer,Integer> test = new MyHashMap<>();
        test.put(1,1);
        test.put(1,3);
        System.out.println(test.toString());
        System.out.println(test.get(2));
    }
}
