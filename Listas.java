// Testando listas

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> num = new ArrayList<>();

        num.add("OI");
        num.add("BOM DIA!");
        num.add("BOA TARDE!");
        num.addFirst("PRIMEIRO");

        System.out.println(num.get(3) );
    }
}
