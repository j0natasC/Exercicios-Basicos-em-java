import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vamos verificar em quê quadrante está o número digitado");
        
        
        System.out.println("Digite as coordenadas de X");
        double x = scan.nextDouble();
        System.out.println("Digite as coordenadas de Y");
        double y = scan.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        }else if (x < 0 && y >= 0 ) {
            System.out.println("Q2");
        }else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }else if (x == 0 && y == 0) {
            System.out.println("Origem");
        }


        scan.close();
}
}
