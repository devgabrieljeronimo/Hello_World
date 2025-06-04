import java.util.*;

public class Sets {
    public static void main(String[] args) {

        // TODOS OS SETS NAO PERMITEM DUPLICADAS DE VALORES

        //List<String> linguagem = new ArrayList<>(); // ORDEM GARANTIDA
        //Set<String> linguagem  = new HashSet<>(); // ORDEM NAO GARANTIDA
        //Set<String> linguagem = new LinkedHashSet<>(); // ORDEM GARANTIDA
        Set<String> linguagem = new TreeSet<>(); // ORDEM ORDENADA

        linguagem.add("Lua");
        linguagem.add("Java");
        linguagem.add("C++");
        linguagem.add("Kotlin");
        linguagem.add("GO");
        linguagem.add("JavaScript");
        linguagem.add("Assembly");

        System.out.println(linguagem);
    }
}
