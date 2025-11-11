import java.util.Scanner;

public class negativoOuNao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vamos descobrir se o número que você digitar é negativo ou não");
        System.out.println("Digite um número inteiro");

        int numero;
        numero = scan.nextInt() ;


        if(numero >= 0){
            System.out.println("Esse numero é positivo");
        }else {System.out.println("Esse número é negativo");}

        scan.close();
    }
}
