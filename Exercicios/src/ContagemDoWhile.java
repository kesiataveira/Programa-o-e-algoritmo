import java.util.Scanner;
public class ContagemDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int n;

        System.out.print("Digite um numero: ");
        n  = scanner.nextInt();
        do {
            System.out.println("Contagem: " +numero);
            numero++;
        } while (numero <= n);
    }
}