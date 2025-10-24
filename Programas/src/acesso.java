import java.util.Scanner;

public class acesso {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite a senha correta para finalizar o programa.");
        int x = scan.nextInt();
        while (x != 2002) {
            System.out.println("Senha incorreta. Tente novamente");
            x = scan.nextInt();
        }
        System.out.println("Senha correta. Acesso permitido e programa finalizado");
        scan.close();
    }
}
