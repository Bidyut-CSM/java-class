public class Javaclass38 {
    public static void main(String[] args) {
        System.out.println("Java Class 38. Nested class in Java");

        Outer obj = new Outer();
        obj.displayall();
        Outer.Inner inner = obj.new Inner();
        inner.display();

    }
}
class Outer {
    String message = "Hello Java";
    class Inner {
        void display() {
            System.out.println("Inner class: "+message);
        }
    }
    void displayall() {
        Inner in= new Inner();
        in.display();
        System.out.println("Outer class: "+message);
    }
}
