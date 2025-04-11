package Polymorphism.OverRiding;

public class Zoo {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.sound();
        animal=new Cat();
        animal.sound();
        animal=new Lion();
        animal.sound();
    }
}
