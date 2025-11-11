import java.util.Scanner;

public class postodegasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo;

        System.out.println("Pesquisa de Preferência de Combustível");

       
        do {
            System.out.print("Informe o código do combustível (1.Álcool 2.Gasolina 3.Diesel 4.Fim): ");
            
           
            if (scanner.hasNextInt()) {
                codigo = scanner.nextInt();
            } else {
            
                scanner.next(); 
                codigo = 0; 
            }
            
            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    
                    break; 
                default:
                
                    System.out.println("Código inválido. Por favor, digite um código entre 1 e 4.");
                    break;
            }
        } while (codigo != 4);

     
        System.out.println("\nMUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}
