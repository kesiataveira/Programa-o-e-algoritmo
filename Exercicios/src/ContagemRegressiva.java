import java.util.Scanner;
public class ContagemRegressiva {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Digite um número inteiro maior que zero: ");
       int n1 = input.nextInt();
       int contador = 1;
       while (contador <= n1) {
           System.out.println("Participante número: " + contador);
           contador++;

       }
    }
}