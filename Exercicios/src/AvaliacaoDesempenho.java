import java.util.Scanner;
public class AvaliacaoDesempenho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota de desempenho do funcionario: ");
        double nota = scanner.nextDouble();

        if (nota >= 9 && nota <=10){
            System.out.println("Classificação: Excelente ");
        }
        else if(nota >= 7 && nota <=8.9){
            System.out.println("Classificação: bom");
        }
        else if(nota >= 5 && nota <=6.9){
            System.out.println("Classificação: Regular ");
        }
        else{
            System.out.println("Classificação: Insatisfatorio");
        }
        scanner.close();
    }

}