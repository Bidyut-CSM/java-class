class Users {
    static int counter = 0;
    void getCounter() {
      counter++;
      System.out.println("count:"+counter);
    }
}

public class Javaclass36 {
    public static void main(String[] args) {
        System.out.println("Java Class 36. Static Variable in Java");
        Users u = new Users();
        u.getCounter();
        u.getCounter();
    }
}
