import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir mensagem solicitando o número da conta, e atribuir à variável numeroConta;
        System.out.println("\nPor favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        // Exibir mensagem solicitando o número da conta, e atribuir à variável numeroConta;
        System.out.println("\nPor favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        // Exibir mensagem solicitando o número do titular da conta, e atribuir à variável nomeTitular;
        System.out.println("\nPor favor, digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        // Exibir mensagem solicitando o saldo, e atribuir à variável saldo;
        System.out.println("\nPor favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Exibir mensagem de confirmação de criação da conta
        String saldoFormatado = String.format("%.2f", saldo);
        String nomeTitularFormatado = nomeTitular.toUpperCase();
        System.out.println("\n##################################################################################################################################################################");
        System.out.println("Olá "+nomeTitularFormatado+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo de R$"+saldoFormatado+" já está disponível para saque.");
        System.out.println("##################################################################################################################################################################");
        scanner.close();
    }
}
