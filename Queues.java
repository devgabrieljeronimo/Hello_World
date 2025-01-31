import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<String> num = new LinkedList<>();

        num.add("Pedro");
        num.add("Rafael");
        num.add("Biru");
        num.add("Herobrine");
        num.add("Vitas");
        num.add("EduUu");
        num.add("Godenot");
        num.add("Guanabara");
        num.add("Selene");
        num.add("Luna");

        System.out.println(num.element() ); // RETURN THE FIRST ELEMENT, IF IT'S EMPTY RETURN EXCEPTION
        System.out.println(num.peek() ); // RETURN THE FIRST ELEMENT, IF IT'S EMPTY RETURN NULL
        System.out.println(num.poll() ); // REMOVE AND RETURN THE FIRST ELEMENT, IF IT'S EMPTY RETURN NULL
        System.out.println(num.remove() ); // REMOVE AND RETURN THE FIRST ELEMENT, IF IT'S EMPTY RETURN EXCEPTION
        System.out.println(num.offer("Solene") ); // TRY TO ADD, IF IT'S CAN, RETURN TRUE, IF ELSE, RETURN FALSE
        System.out.println(num);
    }
}
