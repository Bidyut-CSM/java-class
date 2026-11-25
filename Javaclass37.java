class Person {
    static int counter = 0;
    public static void getCounter() {
      counter++;
      System.out.println("count:"+counter);
    }
}

public class Javaclass37 {
    public static void main(String[] args) {
        System.out.println("Java Class 37. Static Keyword Method in Java");
        Person.getCounter();
        Person.getCounter();
    }
}
