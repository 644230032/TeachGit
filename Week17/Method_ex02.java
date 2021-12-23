package Week17;

public class Method_ex02 {
    // method แบบที่ 2 มีการรับค่าเข้าที่ส่งมาจาก main program แต่ไม่มีการส่งค่าออก
    public static void main(String[] args) {
        pam(55,54);
        display("ดีใจจัง เรียนใกล้จบแล้ว");
        display("ไปตลาดให้หน่อยลูก");


    }

    static void pam(int n1,int n2){
        int result = n1+n2;
        System.out.println("ผลบวกเท่ากับ "+ result);
    }
    static void  display(String x){
        System.out.println(x);
    }
    static void fullname(String fn,String ln){
        System.out.println(fn+" "+ln);
    }
}
