package Week05;
public class PrePostOperator {
    public static void main(String[] args) {
        // declare variable
        int x = 5, y = 4;
        int ans;
        System.out.println("s = " + x);
        System.out.println("y = " + y);

        //ans = x + ++y;
        ans = x + y++;
        
        System.out.println("ans = " + ans);
        System.out.println("y = " + y);

     

    
    }


}
