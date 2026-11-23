public class Javaclass23 {
    public static void main(String[] args) {
       Javaclass23 obj = new Javaclass23();
       System.out.println("Java Class 23. Return VS Println in Java");
       int userAge = 28;
       int days= obj.getAgeInDays(userAge);
       System.out.println("days :"+days);
        obj.CallFn();
    }

    public static int getAgeInDays(int days) {
         return days*365;
    }

    public static void CallFn() {
      System.out.println("function called..");
    }
}
