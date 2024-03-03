import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digiter três nomes separados por virgulas");

        String frase = s.nextLine();
        List lista = new ArrayList<String>(List.of(frase.split(", ")));

        System.out.println("Nomes digitados: "+ lista);
        Collections.sort(lista);
        System.out.println("Nomes digitados em ordem alfabética: " +lista);

    }
}
