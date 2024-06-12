package j14_Varargs;

public class C02_Varargs_Array {
    public static void main(String[] args) {
        int arr[] = {10, 11, 36, 14, 41, 77, 46, 61, 20};
        // task01-> verilen arr elamanlarını toplamını print eden METHOD create ediniz.
        System.out.println("arrTopla(arr) = " + arrTopla(arr));//316

        // task02-> task01 execute(run) eden varargs  METHOD create ediniz.
        System.out.println("varargsTopla(10, 11, 36, 14, 41, 77, 46, 61, 20) = " + varargsTopla(10, 11, 36, 14, 41, 77, 46, 61, 20));//316
    }

    private static int varargsTopla(int... i) {//diva->varargs meth int return type
        int toplam=0;
        for (int each:i){
            toplam+=each;
        }
        return toplam;
    }

    private static int arrTopla(int[] arr) {//int[] p'li meth int return type
        int toplam=0;
        for (int each:arr){
            toplam+=each;
        }
        return toplam;
    }
}
