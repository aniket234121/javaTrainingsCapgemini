package designPatterns;

public class SingletonPattern {
    private static SingletonPattern instance;
    private String dbName;
    private int password;

    public String getDbName() {
        return dbName;
    }

    public int getPassword() {
        return password;
    }
    private SingletonPattern(String dbName, int password) {
        this.dbName = dbName;
        this.password = password;
    }
    public static SingletonPattern getInstance(String dbName, int password) {
        if(instance == null) {
            instance=new SingletonPattern(dbName, password);
        }
        return instance;
    }
}
