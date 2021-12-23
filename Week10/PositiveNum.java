package Week10;

public class PositiveNum {
    public static void main(String[] args) {
        int number = 6;
        String result= number+"เป็นจำนวนเต็มบวก";
        if (number > 0) {
            result =number+ "Positive Number";
        } else if (number < 0) {
            result =number+ "Negative Number";
        } else {
            result =number+ "Zero Number";
        } 
        System.out.println(result);
    }
}