package BasicStringMethods;

public class BasicString {
    public static void main(String[] args) {
        String str=new String("Hello World");

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println("str.equals(str2) :"+str.substring(1));
        System.out.println("str.substrin(3,5) :"+str.substring(3,5));
        String str2="hello world";
        System.out.println("str.equals(str2) :"+str.equals(str2));
        System.out.println("str.equalsIgnoreCase(str2) :"+str.equalsIgnoreCase(str2));
        System.out.println("str.compareTo(str2) :"+str.compareTo(str2));
        System.out.println("str.isEmpty() :"+str.isEmpty());

        System.out.println("str.contains(ello) :"+str.contains("ello"));
        System.out.println("str.indexOf('W') :"+str.indexOf('W'));

//        /Searching
    System.out.println(str.lastIndexOf('o'));
    System.out.println(str.startsWith("hello"));
    System.out.println(str.endsWith("world"));

    //Modification
        System.out.println(str.replace('o','w'));
        System.out.println(str.replaceAll("o","0"));
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());




    }

}
