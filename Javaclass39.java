class Javaclass39student {
    int id;
    String name;
    int age;

    // Constructor 1: No parameters
    Javaclass39student() {
        id = 0;
        name = "Unknown";
        age = 0;
    }

    // Constructor 2: Two parameters
    Javaclass39student(int id, String name) {
        this.id = id;
        this.name = name;
        age = 0;
    }

    // Constructor 3: Three parameters
    Javaclass39student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("----------------");
    }
}
public class Javaclass39 {
    public static void main(String[] args) {
        System.out.println("Java Class 39. Multiple Constructors in Java");
        Javaclass39student s1 = new Javaclass39student();

        Javaclass39student s2 = new Javaclass39student(1, "Alex");

        Javaclass39student s3 = new Javaclass39student(2, "Rahul", 25);

        s1.display();
        s2.display();
        s3.display();
    }
}