public class Javaclass25 {

    public static void main(String[] args) {
       System.out.println("Java Class 25. What is class in Java");
        User user = new User(35,"Bidyut");

        System.out.println("Age: " + user.getAge());
        System.out.println("Name: " + user.getName());
    }
}

class User{
    protected int age =20;
    protected String name = "Bidyut";
    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
