package designPatterns;

import com.scoping.Engine;

public class MainHelper {
    public static void main(String[] args) {
        Engine engine=new Engine(12,"1200Hp","diesel");
        EarlyInstatiation en=new EarlyInstatiation(12312,engine);
        System.out.println(en);
        en.getMirror();
        System.out.println(en.mirrors[0]);
    }
}
