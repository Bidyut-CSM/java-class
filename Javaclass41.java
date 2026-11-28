abstract class Animals {
    // Abstract method
    abstract void sound();
    // Normal method
    void eat() {
        System.out.println("Animal is eating");
    }
}
class PetDog extends Animals {
    // Implement abstract method
    void sound() {
        System.out.println("Dog is barking");
    }
}
public class Javaclass41 {
    public static void main(String[] args) {
        System.out.println("Java Class 31. Abstract class in Java");
        PetDog obj = new PetDog();
        obj.sound();
        obj.eat();
    }
}
