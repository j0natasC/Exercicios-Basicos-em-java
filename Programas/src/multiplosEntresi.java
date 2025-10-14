import java.util.Scanner;

public class multiplosEntresi {
                public static void main(String[] args) {
                 Scanner scan = new Scanner(System.in);   
                    System.out.println("Vamos descobrir se os números são mútiplos entre si");

                    int num1, num2;
                    System.out.println("Digite o primeiro número inteiro");
                    num1 = scan.nextInt();
                    System.out.println("Digite o segundo número");
                    num2 = scan.nextInt();

                    if (num1 % num2  == 0 || num2 % num1 == 0 ) {
                        System.out.println("Esses números são múltiplos ");
                    }else {
                        System.out.println("Esses números não são múltiplos");}





                scan.close();


                }
}
