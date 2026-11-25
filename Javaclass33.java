import java.util.Arrays;

public class Javaclass33 {
    public static void main(String[] args) {
        System.out.println("Java Class 33. String Operations in Java");
        String classnum = " Java Class 33. String Operations in Java ";

        System.out.println(classnum.length());
        System.out.println(classnum.trim());
        System.out.println(classnum.toUpperCase());
        System.out.println(classnum.toLowerCase());
        System.out.println(classnum.substring(0,5));
        System.out.println(classnum.substring(5));
        System.out.println(classnum.replace("Class","Class is"));
        System.out.println(classnum.isEmpty());
        System.out.println(classnum.isBlank());
        String classarr[] = classnum.split("");
        System.out.println(Arrays.toString(classarr));
        String classstr = String.join("", classarr);
        System.out.println(classstr);
    }
}
