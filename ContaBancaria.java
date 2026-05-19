public class ContaBancaria {
    String numeroConta;
    double saldo;
    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }
    public void exibirSaldo() {
        System.out.println("Saldo final: R$ " + saldo);
    }
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6");
        conta.depositar(1000.0);
        conta.sacar(250.0);
        conta.exibirSaldo();
    }
}