import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digiter um nome e o sexo(-m ou -f) da pessoa separados por traço, faça isso para tres pessoas");

        String frase = entrada.nextLine();
        System.out.println(frase);

        String[] arrayNomes = frase.split(", ");

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();
        for (String s : arrayNomes) {
            String nome = s.trim(); // Remove espaços em branco no início e no fim
            if (nome.endsWith("-m")) {
                masculino.add(s);
            } else if (nome.endsWith("-f")) {
                feminino.add(s);
            }
        }
        System.out.println(masculino);
        System.out.println(feminino);
    }
}
