package BasicStringMethods;
import java.util.*;
public class LowerToUpper {
    public static String lowerToUpper(String str) {
    char[] ch=str.toCharArray();
//    System.out.println(Arrays.toString(ch));
    for(int i=0;i<str.length();i++) {
        ch[i]=(char)(ch[i]-32);
    }
    return new String(ch);
    }

    public static String replace(String str,char oldChar,char newChar) {
       char[] ch=str.toCharArray();
       for(int i=0;i<str.length();i++) {
           if(ch[i]==oldChar) {
               ch[i]=newChar;
           }
       }
       return new String(ch);
    }

    public static int lastIndex(String str,char ch) {
        for(int i=str.length()-1;i>=0;i--) {
            if(str.charAt(i)==ch) {
                return i;
            }
        }
        return -1;
    }
    public static boolean check(String str){
     char ch[]=str.toCharArray();
     Arrays.sort(ch);
    int freq[]=new int[ch[ch.length-1]+1];
    ch =str.toCharArray();
    for(int i=0;i<ch.length;i++) {
        freq[ch[i]]++;
    }
    int fre=0;
    for(int i=0;i<freq.length;i++) {
        if(freq[i]!=0){fre=freq[i]; break;}
    }
    for(int i=0;i<freq.length;i++) {
        if(fre!=freq[i] && freq[i]!=0)
        {
            return false;
        }
    }
    return true;


    }
    public static void main(String[] args) {
//        System.out.println(lowerToUpper("hello"));
//        System.out.println(lastIndex("hello",'l'));
//        System.out.println(replace("Hello",'l','t'));
System.out.println(check("abcd"));
    }
}
