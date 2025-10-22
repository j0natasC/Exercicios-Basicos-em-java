import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a coordenada de X");
        int x = scan.nextInt();

        System.out.println("Digite a coordenada de Y");
        int y = scan.nextInt();
          

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            }else if (x > 0 && y < 0) {
                System.out.println("Quarto quadrante");
            }else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            }else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            }else 

            System.out.println("Digite novamente");
            System.out.println("Digite a coordenada de X");
            x = scan.nextInt();

            System.out.println("Digite a coordenada de Y");
            y = scan.nextInt();

        }

         System.out.println("Nula");

        scan.close();
    }   
}
