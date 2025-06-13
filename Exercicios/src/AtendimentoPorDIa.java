import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AtendimentoPorDIa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número do dia:");
        int dia = input.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Atendimento Geral");
                break;
            case 2:
                System.out.println("Suporte Técnico");
                break;
            case 3:
                System.out.println("Financeiro");
                break;
            case 4:
                System.out.println("Recursos Humanos");
                break;
            case 5:
                System.out.println("Vendas");
                break;
            case 6:
                System.out.println("Marketing");
                break;
            default:
                System.out.println("Fechado (Fim de semana)");

        }
        input.close();
    }
}