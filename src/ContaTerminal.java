import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da sua conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + " e conta " + numero + ". Seu saldo é " + saldo + " e já está disponível para saque.");

        scanner.close();
    }
}