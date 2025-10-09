import java.util.Scanner;

public class CalculodeArea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio do circulo:");

        double raio = scan.nextDouble();
        double area = Math.PI * raio * raio;


System.out.printf("A area do circulo de raio %.2f é igual a %.2f", raio, area);

        scan.close();


    }


}
