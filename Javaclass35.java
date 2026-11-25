public class Javaclass35 {
    public static void main(String[] args) {
        System.out.println("Java Class 35. Constructor in Java");
        Studentlist obj = new Studentlist("Alex",20);
        obj.display();
    }
}
class Studentlist {
    public String name;
    public int age;
    // Constructor
    Studentlist(String Name,int Age) {
        System.out.println("Student class called.");
        name = Name;
        age = Age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
