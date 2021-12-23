package Week14;

import Week10.ifElse_Age;

public class StringMethod_StarEnd {
    public static void main(String[] args) {
        String fullname = "Mr.Saharat Pholsan";

        //หาตำแหน่งของคำ  .startswith()
        boolean result = fullname.startsWith("Mr.");

        if (result) {
            System.out.println(fullname + " Mr.");
        } else {
            System.out.println(fullname + " Miss"); 
        }
        //หาตำแหน่งของคำจากด้สนหลัง
        String code = "1234ML";
        boolean result1 = code.endsWith("TH");
        if (result) {
            System.out.println("สินค้า " + code+ " มาจากประเทศไทย");
        } else {
            System.out.println("สินค้า " + code+ " ไม่ได้มาจากประเทศไทย");
        }
    
    }
    
}
