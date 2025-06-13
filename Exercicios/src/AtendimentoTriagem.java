import java.util.Scanner;
public class AtendimentoTriagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a idade do paciente: ");
        int idade = input.nextInt();

        System.out.print("Informe o tipo de plano (1- Convêncio, 2- Particular):");
        int tipo = input.nextInt();

        System.out.print("Informe a especialidade desejada: \n1- Clinica Geral \n2- Pediatria \n3- Cardiologia \n4- Ortopedia \nOpção:");
        int num = input.nextInt();

        if (idade>=65){
            System.out.println("\nAtendimento prioritário (Idoso)");
        } else if (idade<12) {
            System.out.println("\nAtendimento prioritário (Criança)");
        }
        else{
            System.out.println("\nAtendimento Comum");
        }

        switch (num){
            case 1:
                System.out.println("Especialidade: Clínica Geral");
                break;
            case 2:
                System.out.println("Especialidade: Pediatria");
                break;
            case 3:
                System.out.println("Especialidade: Cardiologia ");
                break;
            case 4:
                System.out.println("Especialidade: Ortopedia");
                break;
            default:
                System.out.println("Especialidade Inválida");

        }
    }
}