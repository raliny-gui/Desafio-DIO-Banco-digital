class ContaCorrente extends Conta {
    public Cliente value;
    private static ContaCorrente instance;
    private ContaCorrente(Cliente value) {
        super(value);
    }
    public static ContaCorrente getInstance(Cliente value) {
        if (instance == null) {
            instance = new ContaCorrente(value);
        }
        return instance;
    }
}