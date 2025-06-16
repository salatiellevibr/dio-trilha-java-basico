import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero_conta;
        String agencia_banco;
        String nomecliente;
        float saldo;

        System.out.println("Informe o número da conta: ");
        numero_conta = sc.nextInt();

        System.out.println("Informe a agência: ");
        agencia_banco = sc.nextLine();

        System.out.print("Informa o seu nome: ");
        nomecliente = sc.nextLine();

        System.out.println("Informe seu saldo: ");
        saldo = sc.nextFloat();
        sc.close();

        System.out.printf(
            "Olá %s obrigado por criar uma conta em nosso banco,\nSua Agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
            nomecliente,
            agencia_banco,
            numero_conta,
            saldo
        );
    }
}
