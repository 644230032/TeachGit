package Week15;

public class Array_Basic01 {
    public static void main(String[] args) {
        // การประกาศตัวแปรแบบ array
        // แบบที่1 :ประกาศแบบกำหนดสมาชิก
        int[] number = { 1, 2, 3, 44, 34, 54, 77, 11, 9 };
        int size = number.length;
        System.out.println(size);
        System.out.println(number.length);// หาความยาวของอาเรย์
        System.out.println(number[3]); // การเข้าถึงตำแหน่งของตัวแปร
        number[3] = 88;// การเปลี่ยนค่าข้อมูลในตัวแปร
        System.out.println(number[3]);

        // แแบที่2 : ประกาศแบบกำหนดขนาด

        //char [] alphabet; //ประกาศอาเรย์
       //alphabet = new char[26]; //สรห้างอาเรย์
         
        char [] alphabet = new char[26]; //ประกาศอาเรย์ และสร้างอาเรย์
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';

        System.out.println(alphabet[2]);
        System.out.println(alphabet[25]);
        System.out.println(alphabet.length);

        int []num = new int [10];
        System.out.println(num[9]);




    }
}
