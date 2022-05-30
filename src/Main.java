public class Main {

    public static void main(String[] args) {
        Cliente[] cli = new Cliente[5];
        cli[0] = new Cliente("Raliny");
        cli[1] = new Cliente("Ralidy");
        cli[2] = new Cliente("Raliw");
        cli[3] = new Cliente("Rogerio");
        cli[4] = new Cliente("Edilene");

        Conta cc =  ContaCorrente.getInstance(cli[1]) ;

        Conta cp =  ContaPoupanca.getInstance(cli[2]);

        cc.depositar(350);
       // cc.transferir(100, cp);
        cc.extratoCC();
        //cp.extratoCP();
    }
}
