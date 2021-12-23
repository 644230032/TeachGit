package Week05;
import java.util.Scanner;
public class inputDataFromKeyboard {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter ID : ");
        String id = kb.nextLine();

        System.out.print("Enter Name Lastname : ");
        String name = kb.nextLine();

        
        System.out.print("Enter your birth year : ");
        int year = kb.nextInt();

        System.out.print("Enter your GAP : ");
        float gpa = kb.nextFloat();

        int age = 2564-year;

        System.out.println(id+" ID "+name+" Name Lastname "+age+" your birth year "+gpa+ " GPA ");
        kb.close(); 
        

      
    }
}