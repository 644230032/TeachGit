package Week14;

public class StringMethod_equals {
    public static void main(String[] args) {
        String lastname1 = "Pholsan";
        String lastname2 = "pholsan";


         // เปรียบเทียบ เท่ากัน .equales()
        boolean result = lastname1.equals(lastname2);
        //System.out.println(result);

         // เปรียบเทียบ เท่ากันไมาสนใจอักษรเล็กตัวใหญ่ .equales()
         boolean result2 = lastname1.equalsIgnoreCase(lastname2);

        if (result2) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
    
}
