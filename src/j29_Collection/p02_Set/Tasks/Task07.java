package j29_Collection.p02_Set.Tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task07 {

    /*
    removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, sil.
    Return tipi linkedhashset
    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i döndür.
     */

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>(Arrays.asList("Germany", "France", "USA", "Canada", "Mexico", "Brazil"));

        String s1 = "Germany";
        String s2 = "USA ";




    }
}