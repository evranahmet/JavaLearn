package j25_Exceptions;

public class C03_ClassCastingException {
    public static void main(String[] args) throws ClassCastException{//unchecked exc. throws exc. handle edemez RTE exc. try-catch kullanilir
        //ClassCastingException-> Biribirine donusturulemeyen data type'lar donusturme isleminde olusan RTE
        Object obj="Javacan'lara selam";
        System.out.println("obj = " + obj);
        String str= (String) obj;
        System.out.println("str = " + str);
        Object sayi=49;
//        String sayiStr= (String) sayi;
//        System.out.println("sayiStr = " + sayiStr);
        try {
            String sayiStr= (String) sayi;
            System.out.println("sayiStr = " + sayiStr);
            System.out.println("Try bloktan selamlar bu mesaji okuyorsan try sorunsuz calisti. Catch blok calismadi");
        }catch (ClassCastException e){
            System.out.println("int data type String'e donusturulemez");
            System.out.println("Bu mesaji okuyorsan try exc yakaladi");
        }
        System.out.println("********");
        try {
            String str1= (String) obj;
            System.out.println("sayiStr = " + str1);
            System.out.println("Try bloktan selamlar bu mesaji okuyorsan try sorunsuz calisti. Catch blok calismadi");
        }catch (ClassCastException e){
            System.out.println("int data type String'e donusturulemez");
            System.out.println("Bu mesaji okuyorsan try exc yakaladi");
        }
        System.out.println("Eger bu mesaji okuyorsan app sorunsuz calisti");
    }
}
