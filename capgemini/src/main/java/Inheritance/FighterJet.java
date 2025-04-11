package Inheritance;

public class FighterJet {
    private  String Payload;
    private  String Name;
    public FighterJet(String Payload, String Name) {
        this.Payload = Payload;
        this.Name = Name;
    }
    public void attack(){
        System.out.println("attacked");
    }
}
