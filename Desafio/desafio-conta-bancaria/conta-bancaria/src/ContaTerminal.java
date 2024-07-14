import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitação e armazenamento dos dados da conta bancária
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha após o número da conta

            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo:");
            double saldo = scanner.nextDouble();

            // Exibição da mensagem final
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                    ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
            System.out.println(mensagem);
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira os dados corretamente.");
        } finally {
            // Fechamento do scanner
            scanner.close();
        }
    }
}
