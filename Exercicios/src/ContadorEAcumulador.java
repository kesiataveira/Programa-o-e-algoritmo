public class ContadorEAcumulador {
    public static void main(String[] args) {
       int contador = 1;
       int soma = 0;
       while (contador<= 5){
           soma =  soma + contador;
           contador++;
       }
        System.out.println("A soma dos cinco primeiros numeros inteiros positivos é: "+soma);
    }
}