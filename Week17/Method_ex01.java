package Week17;

public class Method_ex01 {
    public static void main(String[] args) {
        // method แบบที่ 1 ไม่มีการส่งค่าจาก method main และ ไม่มีการคืนค่ากลับจาก
        // method ลูก
        openFile();
        playFile();
        pauseFile();
        pauseFile();
        closeFile();

    }

    public static void openFile() {
        System.out.println("Open file.............");
    }

    public static void playFile() {
        System.out.println("Play Misic............");
    }

    public static void pauseFile() {
        System.out.println("Stop Misic............");
    }

    public static void closeFile() {
        System.out.println("Exit............");
    }
}
