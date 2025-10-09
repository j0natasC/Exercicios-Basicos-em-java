import java.util.Scanner;

public class Calculodoisvalores{
    public static void main(String[] args) throws Exception {
       
        Scanner scan = new Scanner(System.in);

        int valor1, valor2, soma;

        System.out.println("Faremos a soma de dois valores inteiros. Digite o primerio valor:");
        valor1 = scan.nextInt();

        System.out.println("Agora digite o segundo valor:");
        valor2 = scan.nextInt();

        soma = valor1 + valor2;

        System.out.printf ("A soma de %d e %d é igual a %d", valor1, valor2, soma);



        scan.close();



    }
}
