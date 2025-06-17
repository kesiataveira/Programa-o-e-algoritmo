import java.util.Scanner;
public class NotasDoWhile {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double nota;
       double soma = 0;
       double media;
       int qtd = 0;
       do {
           System.out.println("Digite a nota: ");
           nota = sc.nextDouble();
           if (nota >= 0 && nota <= 10) {
               soma += nota;
               qtd++;
           } else if (nota<0) {
               System.out.println("Entrada encerrada.");
           } else {
               System.out.println("Nota invalida.");
           }

       }while (nota>0);
       if (qtd>0) {
           media = soma/qtd;
           System.out.println("A media das notas é: "+media);
       }


    }
}