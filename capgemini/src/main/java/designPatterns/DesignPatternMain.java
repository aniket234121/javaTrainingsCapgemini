package designPatterns;

public class DesignPatternMain {
    public static void main(String[] args) {

        // 1.Factory Pattern Example
        FactoryPattern ft=FactoryPattern.getFactoryPatternObj("hello","hi");
        FactoryPattern ft1=FactoryPattern.getFactoryPatternObj("somthing","getasdfa");
        FactoryPattern ft2=FactoryPattern.getFactoryPatternObj("no match","dumb");
        System.out.println(ft);
        System.out.println(ft1);
        System.out.println(ft2);

System.out.println("-----------------------------------------------------------------");
        // 2.Singleton Pattern Example main
        SingletonPattern st1=SingletonPattern.getInstance("mongodb",12341);
        SingletonPattern st2=SingletonPattern.getInstance("mysql",12342);
        System.out.println(st1);
        System.out.println(st2);


    }
}
