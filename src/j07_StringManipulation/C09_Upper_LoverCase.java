package j07_StringManipulation;

public class C09_Upper_LoverCase {//class level
    public static void main(String[] args) {//main menü

        /*
 toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
ignoreCase()-> verilen string'i BUYUK-kucuk harf duyarlılığını kaldırır.
  */
        String str="Madem Geldin Dünyaya CAlis JAVA'ya";
        System.out.println("str = " + str);//Madem Geldin Dünyaya CAlis JAVA'ya
        System.out.println("str.toUpperCase() = " + str.toUpperCase());//MADEM GELDİN DÜNYAYA CALİS JAVA'YA
        System.out.println("str.toLowerCase() = " + str.toLowerCase());//madem geldin dünyaya calis java'ya
        


    }//main sonu
}//class sonu
