import java.util.Scanner;

public class horario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Faremos a leitura e calculo das horas de inicio e fim de sua jogatina");
        System.out.println("Digite a hora inteira de inicio. Exemplo: 09 ou 16");

        int inicio = scan.nextInt();
        System.out.println("Agora digite a hora de fim da jogatina");
        int fim = scan.nextInt();
        int umDia = 24;
        int duracao;

        if (inicio < fim) {
            duracao = (umDia - fim) + inicio;
            System.out.printf("Você jogou por %d horas", duracao);
        } else {
            duracao = (umDia - inicio) + fim;

            System.out.printf("Você jogou por %d horas", duracao);
        }

        scan.close();
    }
}
