package Polymorphism.OverRiding;

public class Planet implements Cloneable{
    String planetName;
    int cycledYear;
    long distanceFromSun;
    int rotation;

public Object clone() throws CloneNotSupportedException {
    return super.clone();
}
    public boolean equals(Object ob) {
        Planet p=(Planet)ob;
        return this.planetName.equals(p.planetName) && this.cycledYear == p.cycledYear && this.distanceFromSun == p.distanceFromSun && this.rotation == p.rotation;
    }

    Planet(){}
    Planet(String planetName)
    {
        this.planetName = planetName;
    }
    Planet(String planetName,int cycledYear)
    {
        this(planetName);
        this.cycledYear=cycledYear;
    }
    Planet(String planetName,int cycledYear,long distanceFromSun)
    {
        this(planetName,cycledYear);
        this.distanceFromSun = distanceFromSun;
    }
    Planet(String planetName, int cycledYear, long distanceFromSun, int rotation) {
        this(planetName,cycledYear,distanceFromSun);
        this.rotation = rotation;
    }
    public String toString(){
        return "[ planetName: "+this.planetName+", cycled Year: "+this.cycledYear+" distanceFromSun: "+this.distanceFromSun+", rotation: "+this.rotation+"]";
    }
}
