import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Javaclass32 {
    public static void main(String[] args) {
      System.out.println("Java Class 32. Array in Java");

      System.out.println("Java index array Or Single-dimensional");
      String skills[]=new String[3];//   {"php","nodejs","java"}
      skills[0]="php";
      skills[1]="nodejs";
      skills[2]="java";
      System.out.println(Arrays.toString(skills));
      System.out.println(String.join(", ", skills));
      for (String skill : skills) {
          System.out.println("skill is: "+skill);
      }

      System.out.println("Java associative array OR Two Dimensional Array");
      ArrayList<HashMap<String, Object>> users = new ArrayList<>();
      int total_users=5;
      for(int i=0;i<total_users;i++){
          int id = i+1;
          // First record
          HashMap<String, Object> user = new HashMap<>();
          user.put("id", id);
          user.put("name", "alex "+id);
          user.put("age", id*2);
          // Add records to ArrayList
          users.add(user);
      }
      System.out.println(users);

        int total = users.size();
        if(total > 0){
            System.out.println("Total users: "+total);
            // Get first record
            HashMap<String, Object> first_user = users.get(0);
            // Loop through HashMap
            System.out.println("First user is");
            System.out.println(first_user);
            for (Map.Entry<String, Object> entry : first_user.entrySet()) {
                System.out.println( entry.getKey() + " = " + entry.getValue());
            }
        }

        System.out.println("Print all key-value pairs. Using HashMap");
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Rahul", 85);
        students.put("Amit", 90);
        students.put("Priya", 95);

        System.out.println("Rahul Marks: " + students.get("Rahul"));
        System.out.println("Amit Marks: " + students.get("Amit"));
        if(students.containsKey("Priya")){
            System.out.println("Priya Marks: " + students.get("Priya"));
        }

        System.out.println("Java Multidimensional array");
        ArrayList<HashMap<String, Object>> total_users_product_list = new ArrayList<>();
        int total_users_product=5;
        for(int i=0;i<total_users_product;i++){
            int id = i+1;
            // First record
            HashMap<String, Object> user = new HashMap<>();
            user.put("userid", id);
            user.put("username", "alex "+id);
            user.put("userage", id*2);
            ArrayList<HashMap<String, Object>> product_list = new ArrayList<>();
            for(int j=0;j<i;j++){
                int pid = i+j+1;
                HashMap<String, Object> product = new HashMap<>();
                product.put("id", pid);
                product.put("name", "product "+i+" "+pid);
                product.put("price", pid*2);
                product_list.add(product);
            }
            user.put("products", product_list);
            total_users_product_list.add(user);
        }
        System.out.println(total_users_product_list);

        int total_users_product_is = total_users_product_list.size();
        if(total_users_product_is > 0) {
            HashMap<String, Object> users_product_list = total_users_product_list.get(4);
            System.out.println("First user product is");
            System.out.println(users_product_list);

            ArrayList<HashMap<String, Object>> products = (ArrayList<HashMap<String, Object>>) users_product_list.get("products");
            HashMap<String, Object> product = products.get(0);

            System.out.println("product name: "+product.get("name"));
            System.out.println("product price: "+product.get("price"));
        }
    }
}
