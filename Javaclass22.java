public class Javaclass22 {
    public static void main(String[] args) {
       Javaclass22 obj = new Javaclass22();
       System.out.println("Java Class 22. Parameterized Function in Java");
       int userAge = 28;
       int days= obj.getAgeInDays(userAge);
       System.out.println("days :"+days);
    }

    public static int getAgeInDays(int days) {
         return days*365;
    }
}
