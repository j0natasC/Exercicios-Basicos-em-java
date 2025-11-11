import java.util.Scanner;

public class TrianguloCirculoQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        double triangulo, circulo, trapezio, quadrado, retangulo;
        System.out.println("Digite o valor de A, B e C respectivamente:");



        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        triangulo = (a * c) / 2;
        System.out.printf("Calculo do triângulo retângulo: %.2f", triangulo);
        circulo = (Math.PI * Math.pow(c, 2));
        System.out.printf("A área do círculo: %.2f", circulo, "\n");

        trapezio = ((a + b) * c / 2);
        System.out.printf("Área do Trapézio: %.2f", trapezio, "\n");
        quadrado = Math.pow(b,2);
        System.out.printf("Área do Quadrado: %.2f", quadrado, "\n");
        retangulo = a * b;
        System.out.printf("Área do Retângulo: %.2f", retangulo, "\n");
                scan.close();
    }
}
