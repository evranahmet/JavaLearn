package j99_codeChallange.Challange08;

public class Task02 {
    public static void main(String[] args) {
        /* task->
         * array elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari print eden code create ediniz.
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */
        int arr[] = {1, 2, 33, 4, 15, 6, 17};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {// arr eleman toplamı hesap eden loop
            toplam += arr[i];//loop dan gelen  her bir arr elemanı toplama eklendi
        }
        System.out.println("arr ortalaması : " + ((toplam / arr.length)));// 11

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > (toplam / arr.length)) {
                System.out.print(arr[i] + " ");
            }
        }
    }// main sonu


}// Class sonu