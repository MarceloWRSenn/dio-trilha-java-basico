import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        //Conhecer e importar a classe scanner.
        Scanner scanner = new Scanner(System.in);

        //Exibir e pedir as informações são necessárias.
        System.out.printf("Digite seu nome. \n");
        String name = scanner.nextLine();

        System.out.printf("Digite o número da sua agência. \n");
        String bankOffice = scanner.nextLine();

        System.out.printf("Digite o número da sua conta. \n");
        int account = scanner.nextInt();

        System.out.printf("Digite o seu saldo \n");
        double balance = scanner.nextDouble();

        //Exibir a mensagem de conta criada.

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque \n", name, bankOffice, account, balance);

    }
}
