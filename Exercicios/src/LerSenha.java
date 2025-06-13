import java.util.Scanner;
public class LerSenha {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int senha = 1234;

       System.out.print("Digite a senha: ");
       int senha1 = ler.nextInt();

       while (senha1 != senha){
           System.out.println("Senha incorreta.");
           System.out.print("Tente novamente:");
           senha1 = ler.nextInt();

       }
       System.out.println("Acesso permitido");
    }
}