package DataStructures.HashMap;

public class HashMapDriver {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,"aniket");
        hashMap.put(2,"ram");
        hashMap.put(3,"helo");
        hashMap.put(2,"kateru");
        System.out.println(hashMap.get(2));
    }
}
