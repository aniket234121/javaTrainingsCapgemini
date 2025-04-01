package designPatterns;

import com.scoping.Engine;
import com.scoping.Mirror;
import com.scoping.Tyre;

public class EarlyInstatiation {

    private int id;
    private Engine engine;
    private Tyre[]tyres = new Tyre[4];
    public Mirror[] mirrors;

    {
        for(int i=0;i<tyres.length;i++) {
            tyres[i]=new Tyre();
        }
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public EarlyInstatiation(int id, Engine engine) {
        this.id = id;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    //lazy instantiation
    public void getMirror(){
        mirrors=new Mirror[4];
        for(int i=0;i<mirrors.length;i++) {
            mirrors[i]=new Mirror();
        }
    }
}
