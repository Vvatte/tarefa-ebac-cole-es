import java.util.Scanner;
public class Tarefa1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digiter três nomes separados por virgulas");


        String nomes = s.next();
        System.out.println(nomes);

        String[] array = s.nextLine().split(",");
        System.out.println("nomes:" + array);

    }
}
