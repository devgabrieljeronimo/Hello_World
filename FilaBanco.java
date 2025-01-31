import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilaBanco {
    public static void main(String[] args) throws InterruptedException {

        //Queue<String> filaCliente = new PriorityQueue<>(); // ORDEM ALFABETICA
        Queue<String> filaCliente = new LinkedList<>(); // ORDEM DE ENTRADA


        // EU SEI QUE OS CLIENTES SAO LINGUAGENS
        filaCliente.add("Lua");
        filaCliente.add("Java");
        filaCliente.add("C#");
        filaCliente.add("C++");
        filaCliente.add("C");
        filaCliente.add("Crystal");
        filaCliente.add("Rusty");
        filaCliente.add("PHP");
        filaCliente.add("JavaScript");
        filaCliente.add("Python");
        filaCliente.add("TypeScript");
        filaCliente.add("GO");
        filaCliente.add("Assembly");

        while ( !filaCliente.isEmpty() ) {
            System.out.println("Clientes restantes: " + filaCliente );
            Thread.sleep(2000);
            System.out.println("Cliente atendido: " + filaCliente.poll() );
            Thread.sleep(1000);
        }
    }
}
