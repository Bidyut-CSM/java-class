import java.util.InputMismatchException;
import java.util.Scanner;
public class Javaclass17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Java Class 17. Get input from the user. Scanner Class");
            System.out.println("Entrer first number:");
            float a = scan.nextInt();
            System.out.println("Entrer second number:");
            float b = scan.nextInt();
            System.out.println("Entrer calculate oparetor:");
            String operator = scan.next();
            float val = 0;
            switch (operator) {
                case "+":
                    val = a + b;
                    break;
                case "-":
                    val = a - b;
                    break;
                case "*":
                    val = a * b;
                    break;
                case "/":
                    if (b > 0) {
                        val = a / b;
                    } else {
                        val = 0;
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    val = 0;
            }
            System.out.println("output: " + val);
        } catch (InputMismatchException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            scan.close();
            System.out.println("Program execution completed.");
        }
    }
}
