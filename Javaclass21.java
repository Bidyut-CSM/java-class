public class Javaclass21 {
    public static void main(String[] args) {
       System.out.println("Java Class 21. How to make function in Java");
       Javaclass21 Fn= new Javaclass21();
       float valueis = 0;
        try {
           valueis = Fn.calculat(3,4,"*");
        } catch (Exception e) {
            valueis =0;
            System.out.println("Calculation! Something went wrong: " + e.getMessage());
        }
       System.out.println("output: "+valueis);
    }

    public float calculat(int n1, int n2, String operator){
        float val =0;
        int a=n1;
        int b=n2;
        try {
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
            return val;
        } catch (Exception e) {
            System.out.println("Calculation! Something went wrong: " + e.getMessage());
            return val;
        } finally {
            System.out.println("calculation completed.");
        }
    }
}
