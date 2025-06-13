import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try {
            Scanner newScanner = new Scanner(System.in);
            
            System.out.println("Insira seu nome: ");
            String clientName = newScanner.nextLine();
            
            System.out.println("Por favor, digite o número da sua agência");
            String agencyNum = newScanner.nextLine();
    
            System.out.println("Por favor, digite o número da sua conta");
            int accountNum = newScanner.nextInt();
    
            System.err.println("Quanto valor do saque?");
            double withdrawal = newScanner.nextDouble();
    
            newScanner.close();
    
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", 
            clientName, 
            agencyNum, 
            accountNum, 
            withdrawal);
        } 
        catch (InputMismatchException e) {
            System.out.println("O valor inserido é inválido");
        }
        catch(Exception e) {
            System.out.println("Ocorreu um erro. Por favor, tente novamente mais tarde.");
        }

    }
}