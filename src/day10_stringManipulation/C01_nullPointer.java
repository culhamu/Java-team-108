package day10_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str1="";
        String str2="   ";
        String str3;
        String str4=null;
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str1.isBlank());
        System.out.println(str2.isBlank());//null bir değer değil işaretçidir.
        //nullpointer: nonprimitive bir objenin oluşturulduğunu
        //              ancak bilinçli olarak değer atanmadığını işaret eder

    }
}
