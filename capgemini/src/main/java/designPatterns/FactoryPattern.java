package designPatterns;

public class FactoryPattern {
    private String var1;
    private String var2;

    public String getVar1() {
        return var1;
    }

    public String getVar2() {
        return var2;
    }

    private FactoryPattern(String var1, String var2) {
        this.var1 = var1;
        this.var2 = var2;
    }
    public static FactoryPattern getFactoryPatternObj(String var1,String var2)
    {
        return new FactoryPattern(var1,var2);
    }

    @Override
    public String toString() {
        return "FactoryPattern{" +
                "var1='" + var1 + '\'' +
                ", var2='" + var2 + '\'' +
                '}';
    }
}
