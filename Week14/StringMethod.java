package Week14;


public class StringMethod {
    public static void main(String[] args) {
        String name = "Saharat";
        String city = new String("Nakhon Pathom");

        System.out.println(name);
        System.out.println(city);

        //การต่อสตริง concat()
        System.out.println(name+city);

        String result = name+city;
        System.out.println(result);

        String result1 = name+city + ".com";
        System.out.println(result1);

        System.out.println(result1.concat(".ac.th"));

        System.out.println(result1 + ".ac.th");

        //หาความยาวของตริง .length()
        System.out.println(name.length());
        
        int count = name.length();
        System.out.println(count);

        //หาตำแหน่งตัวอักษรในข้อความ .charAT()
        System.out.println(name.charAt(0));

        char Characters = name.charAt(0);
        System.out.println(Characters);



    }
}
