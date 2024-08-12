package br.com.bancodigital.modelo;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.extrato();
    }
}
