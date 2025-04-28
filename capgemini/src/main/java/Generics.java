import java.util.ArrayList;

public class Generics {
    public<T> void add(ArrayList<?> list,T value) {
//        addHelper(list,value);
    }



    public <T> void addHelper(ArrayList<T> list,T value) {
        list.add(value);
    }
    public static void main(String[] args) {

    }
}