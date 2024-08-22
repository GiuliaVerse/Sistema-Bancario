public class ContaBancaria {
    private Cliente cliente;
    private double saldo;

    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void exibirExtrato() {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Saldo: R$ " + saldo);
    }

    public void alterarCadastro(String novoNome, String novoCpf) {
        cliente.setNome(novoNome);
        cliente.setCpf(novoCpf);
    }
}
