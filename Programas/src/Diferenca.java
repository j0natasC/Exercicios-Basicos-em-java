import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C, D;
        double diferenca;
        System.out.println("A seguir digite quatro valores inteiros");
        
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        diferenca = (A * B - C * D);

        System.out.printf("A diferença entre o produto A: %d e B: %d pelos produtos C: %d e D: %d é igual a Diferença: %.2f", A, B, C, D, diferenca);


        scan.close();




    }
    
}