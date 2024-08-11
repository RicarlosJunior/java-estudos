package modelo;

public class ContaPoupanca  extends Conta{
    
    private double taxaJuros;

    public ContaPoupanca(Cliente cliente, double taxaJuros) {
        super(cliente);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void extrato(){
        System.out.println("=== Extrato Conta Poupanca ===");
        super.extrato();
        System.out.println(String.format("=== Taxa de Juros %.2f ===", this.taxaJuros));
    }


    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
     
}
