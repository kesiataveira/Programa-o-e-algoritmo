import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = input.nextDouble();

        if (nota >= 90 && nota <=100){
            System.out.println("conceito: A");
        }
        else if (nota >= 80 && nota <=89){
            System.out.println("conceito: B");
        }
        else if (nota >= 70 && nota <=79){
            System.out.println("conceito: C");
        }
        else if (nota >= 60 && nota <=69){
            System.out.println("conceito: D");
        }
        else {
            System.out.println("conceito: F");
        }
    }
}