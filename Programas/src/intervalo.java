import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Digite um número para saber a qual intervalo ele pertence [0,25], (25,50], (50,75], (75,100]");

        double num = scan.nextDouble();
        double[] intervalo = { 0.25, 25.50, 50.75, 75.100 };

        if (num <= intervalo[0]) {
            System.out.println("Intervalo entre (0.25)");
        } else if (num <= intervalo[1]) {
            System.out.println("Intervalo entre (25,50)");

        } else if (num <= intervalo[2]) {
            System.out.println("Intervalo entre (50,75)");

        } else if (num <= intervalo[3]) {
            System.out.println("Intervalo entre (75,100)");
        }

        scan.close();
    }
}
