package day07_ternary_Switch_Statements;

public class C10_switch {
    public static void main(String[] args) {
        int gunNo=3;

        switch (gunNo) {
            case 1 :
                System.out.println("pazartesi");
                break;
            case 2 :
                System.out.println("salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            case 4 :
                System.out.println("perşembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case  7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("Gün sayısı geçersiz");
        }
    }
}
