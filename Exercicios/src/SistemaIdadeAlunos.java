import java.util.Scanner;
public class SistemaIdadeAlunos {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Digite as idades dos alunos. Digite 0 para encerrar");

       System.out.print("Informe a idade do aluno: ");
       int idade = input.nextInt();
       int contador = 0;
       while (idade!= 0){
           contador++;
           System.out.print("Informe a idade do aluno: ");
           idade = input.nextInt();

       }
        System.out.println("Quantidade de alunos entrevistados:" +contador);

    }
}