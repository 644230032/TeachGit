package Week15;
public class Array_ShowGender {
    public static void main(String[] args) {
        String [] name = {"นายสมชาย","นางสาวสมหญิง","นางสมนึก","นายสมดี"};
        System.out.println(name.length);

        

        for (int i = 0; i < name.length; i++) {
          boolean check = name[i].startsWith("นาย");
          if (check) {
            System.out.println(name[1]);
              System.out.println("เพศชาย");
          } else {
              System.out.println("เพศหญิง");
          }
           
            
        }
    }
}
