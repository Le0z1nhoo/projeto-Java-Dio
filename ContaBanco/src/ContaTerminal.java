import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem Vindo ao Cadastro do Banco Santander!");
        
        System.out.println("Primeiro Informe seu Nome Completo: ");
        var nome = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da Conta: ");
        int contab = scanner.nextInt();
        
        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("\n===== Conta Criada com Sucesso! =====%n");
        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco.%n", nome);
        System.out.printf("Sua agência é %s, Conta %d e seu saldo R$%.2f já está disponível para saque.%n", agencia, contab, saldo);
        System.out.println("\n===== Parabéns =====");
        
        scanner.close();
    }
}