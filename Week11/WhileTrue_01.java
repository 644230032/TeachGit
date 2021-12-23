package Week11;

public class WhileTrue_01 {
    public static void main(String[] args) {

        int i =0; //ค่าเริ่มต้น
        while (true) {
            i++;
            System.out.print(i++ +" ");//เงื่อนไข
            i++;//updateรอบ //หรือi+=2;
            if (i>=1000) break;
               
            }
        }
    }
