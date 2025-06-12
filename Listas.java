// Testando listas

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> num = new ArrayList<>();

        num.add("OI"); // ADIOCIONA VALORES AO ARRAY
        num.add("BOM DIA!");
        num.add("BOA TARDE!");
        num.add("BOA NOITE!");
        num.add("ROI");

        num.addFirst("PRIMEIRO"); // ADICIONA VALORES NA PRIMEIRA E ULTIMA POSICAO
        num.addLast("ULTIMO");

        num.set(6, "OI"); // MUDA O VALOR DA POSICAO 6 (ULTIMA)

        while (!num.isEmpty() ) {
            System.out.println(num.getLast() );
            num.removeLast();
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
