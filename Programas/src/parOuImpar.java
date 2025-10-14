import java.util.Scanner;

public class parOuImpar {
        public static void main(String[] args) {
            System.out.println("Digite um número inteiro para saber se ele é Impar ou Par");

            Scanner scan = new Scanner(System.in);
         
            int numero = scan.nextInt();

            if (numero % 2 == 0) {
                System.out.println(" número é Par");
            }else {System.out.println("Esse número é Impar");}


            scan.close();
        }
}
