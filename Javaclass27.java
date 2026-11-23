public class Javaclass27 {
    public static void main(String[] args) {
      System.out.println("Java Class 27. For Loop in Java");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Nested For Loop in Java");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
