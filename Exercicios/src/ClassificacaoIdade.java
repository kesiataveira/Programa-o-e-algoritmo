import java.util.Scanner;
public class ClassificacaoIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a sua idade:");
        int idade = input.nextInt();

        if (idade < 18){
            System.out.println("Menor de idade!");
        } else if (idade >= 18 && idade <=59){
            System.out.println("Adulto");
        } else {
            System.out.println("idoso");
        }
    }
}