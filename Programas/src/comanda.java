import java.util.Scanner;

public class comanda {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] item = { "Cachorro quente", "X-Salada", "X-Bacon", "Torrada Simples", "Refrigerante" };
        double[] valor = { 4.00, 4.50, 5.00, 2.00, 1.50 };

        System.out.println(
                "MENU\n Escolha uma opção digitando o número\n 1 - Cachorro quente \n 2 - X-Salada\n 3 - X-Bacon\n 4 - Torrada Simples\n 5 - Refrigerante");

        int pedido = scan.nextInt();
        int indice = pedido - 1;
        System.out.printf("Você escolheu um(a) %s no valor de R$: %.2f. Digite a quantidade\n", item[indice],
                valor[pedido - 1]);
        int quantidade = scan.nextInt();
        double total = valor[indice] * quantidade;

        System.out.printf("Você pediu %d - %s no valor de R$: %.2f ", quantidade, item[indice], total);
        

        scan.close();

    }
}
