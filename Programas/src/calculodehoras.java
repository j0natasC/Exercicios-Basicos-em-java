import java.util.Scanner;

public class calculodehoras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("A seguir faremos o calculo de horas trabalhadas");
        System.out.println("Digite seu número de identificação:");
        int numero = scan.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas:");
        double horasTrabalhadas = scan.nextDouble();

        System.out.println("Digite o valor recebido por cada hora:");
        double valorHora = scan.nextDouble();

        double calculo = (horasTrabalhadas * valorHora);

        System.out.printf(
                "Número de identificação de funcionario: %d\n Você trabalhou por: %.2f horas \n com cada hora por: %.2f \n Todalizando %.2f reais",
                numero, horasTrabalhadas, valorHora, calculo);

        scan.close();

    }
}
