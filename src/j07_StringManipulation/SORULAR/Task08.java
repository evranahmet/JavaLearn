package j07_StringManipulation.SORULAR;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int a= harfDepo.indexOf('A');
        int b= harfDepo.indexOf('H');
        int c= harfDepo.indexOf('M');
        int d= harfDepo.indexOf('E');
        int e= harfDepo.indexOf('T');
        System.out.println(harfDepo.charAt(a)+""+harfDepo.charAt(b)+""+harfDepo.charAt(c)+""+harfDepo.charAt(d)+""+harfDepo.charAt(e));





    }
}
