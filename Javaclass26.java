public class Javaclass26 {
    public static void main(String[] args) {
       System.out.println("Java Class 26. What is Object in java");
       Student s = new Student();
       System.out.println("Age is: "+s.defaultAge);
    }

}

class Student {
    public int defaultAge = 18;
    public String getName(){
        return "Bidyut";
    }
}
