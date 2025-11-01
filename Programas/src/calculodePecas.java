import java.util.Scanner;

public class calculodePecas {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Vamos descobrir o valor do produto");
            System.out.println("Digite o codigo da peça");
            int peca = scan.nextInt();

            System.out.println("Digite a quantidade de peças");
            int quantidade = scan.nextInt();


            System.out.println("Digite o valor unitario de cada peça");
            double valor = scan.nextDouble();
            System.out.println("Vamos repetir o processo");

            System.out.println("Digite o codigo da peça");
            int peca2 = scan.nextInt();

            
            System.out.println("Digite a quantidade de peças");
            int quantidade2 = scan.nextInt();

            System.out.println("Digite o valor unitario de cada peça");
            double valor2 = scan.nextDouble();

            double calculo = (valor * quantidade ) + (valor2 * quantidade2);

            System.out.println("Total a pagar de:" + calculo );

            scan.close();

        }
}
