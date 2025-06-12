import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DiagnosticoFebre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a temperatura do paciente: ");
        double temperatura = input.nextDouble();

        if (temperatura < 36){
            System.out.println("O paciente está com hipotermia ");
        }
        else if(temperatura >= 36 && temperatura <= 37.4){
            System.out.println("Temperatura normal");
        }
        else if(temperatura >= 37.5 && temperatura <=38.5){
            System.out.println("O paciente está febre leve ");
        }
        else if(temperatura >= 38.6 && temperatura <= 39.9){
            System.out.println("Classificação: Insatisfatorio");
        }
        else{
            System.out.println("O paciente está com febre alta");
        }
        input.close();
    }
}