public class Javaclass40 {
    static void main(String[] args) {
        System.out.println("Java Class 40. Inheritance in Java");
        Dog obj = new Dog();
        System.out.println(obj.name);
        obj.eat();
        obj.bark();
    }
}

class Animal {
    String name = "Animal";
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}




