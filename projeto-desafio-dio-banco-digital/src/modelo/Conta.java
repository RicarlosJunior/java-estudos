package modelo;

public abstract class Conta {

    private static final String AGENCIA = "0001";
    private static int NUMERO_CONTA = 1;

    protected String agencia;
    protected int numeroConta;
    protected Cliente cliente;
    private double saldo;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA;
        this.numeroConta = NUMERO_CONTA++;
        this.cliente = cliente;
    }


    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void extrato(){
        System.out.println(String.format("=== Agência: %s ===", this.agencia));
        System.out.println(String.format("=== Numero Conta: %d ===", this.numeroConta));
        System.out.println(String.format("=== Cliente: %s ===", this.cliente.getNome()));
        System.out.println(String.format("=== Saldo R$: %.2f ===", this.saldo));
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Agência: " + agencia + " Conta: " + numeroConta + " Cliente: " + cliente.getNome();
    }

    

}
