public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int num;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.num = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void extratoCC() {
        System.out.println("----- Extrato da Conta Corrente ----- ");
        System.out.printf("- Titular da Conta Corrente: %s%n", this.cliente.getNome());
        System.out.printf("- Agência: %d%n", this.agencia);
        System.out.printf("- Número da Conta: %d%n", this.num);
        System.out.printf("- Saldo: %.2f \n%n", this.saldo);
    }

    protected void extratoCP() {
        System.out.println("----- Extrato da Conta Poupança ----- ");
        System.out.printf("- Titular da Conta Poupança: %s%n", this.cliente.getNome());
        System.out.printf("- Agência: %d%n", this.agencia);
        System.out.printf("- Número da Conta: %d%n", this.num);
        System.out.printf("- Saldo: %.2f \n%n", this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNum() {
        return num;
    }

    public double getSaldo() {
        return saldo;
    }

}