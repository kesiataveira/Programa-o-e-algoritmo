import java.util.Scanner;
public class SistemaEscolar {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite uma nota entre 0 e 10:");
      int nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Tente novamente.");
            System.out.print("Digite uma nota entre 0 e 10:");
            nota = scanner.nextInt();

        }
        System.out.println("Nota válida:" +nota);
    }
}