import java.util.Scanner;
public class SistemaSeguranca {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int senha1 = 123;
       int senha;

       int cont = 0;
       do {
           System.out.print("Digite a senha:");
           senha = scanner.nextInt();

           if (senha != senha1) {
               System.out.println("Senha incorreta.");
               cont++;
           } else{
               System.out.println("Bem vindo ao sistema.");
           }
       }while (cont <3);
    }
}