class ContaPoupanca extends Conta {
    public Cliente value;
    private static ContaPoupanca instance;
    private ContaPoupanca(Cliente value){
        super(value);
    }
    public static ContaPoupanca getInstance(Cliente value) {
        if (instance == null) {
            instance = new ContaPoupanca(value);
        }
        return instance;
    }
}