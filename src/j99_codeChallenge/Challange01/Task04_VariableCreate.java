package j99_codeChallenge.Challange01;

public class Task04_VariableCreate {
    public static void main(String[] args) {//main level
        // dataType variableName      =  initializing(ilk değer(value) atama)   ;
        int yas = 49;

        System.out.println("yas = " + yas);//49
        int id;//initial edilmemiş sadcee declare edilmiş variable
        //  System.out.println("id = " + id);//initial edilmeiş variable action alamaz..CTE
        id = 1453;// declare edilen vairable call edilerek assaignment (atama) yapıldı
        System.out.println("id = " + id);//1453

        // multiply decleration..
        int age, boy, tecrube, tc;//aynı data type 4 farklı variable declera edildi.
        age = 50;
        boy = 190;
        tecrube = 5;//atama yapıldı
        String ad = "Haluk", soyad = "Bilgin";

        //Bir variable tanimlayin : x
        //Baska bir variable initialize edin : y
        //x variable initialize edin
        //y variable'ı yeni bir value ile update ediniz.
        // int x;
        // int y=33;
        int x, y = 33;
        x = 44;
        y = 50;

        System.out.println(x + " " + y);//44 50
    }//main sonu
}//Class sonu
