import java.util.Scanner;

public class SistemaBancario {
    private static Banco banco = new Banco();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarConta();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    exibirExtrato();
                    break;
                case 5:
                    alterarCadastro();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\nSistema Bancário");
        System.out.println("1. Cadastrar conta");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar");
        System.out.println("4. Exibir extrato");
        System.out.println("5. Alterar informações cadastrais");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarConta() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf);
        banco.cadastrarConta(cliente);
    }

    private static void sacar() {
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Valor do saque: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        banco.sacar(cpf, valor);
    }

    private static void depositar() {
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Valor do depósito: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        banco.depositar(cpf, valor);
    }

    private static void exibirExtrato() {
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        banco.exibirExtrato(cpf);
    }

    private static void alterarCadastro() {
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Novo nome: ");
        String novoNome = scanner.nextLine();
        System.out.print("Novo CPF: ");
        String novoCpf = scanner.nextLine();
        banco.alterarCadastro(cpf, novoNome, novoCpf);
    }
}
