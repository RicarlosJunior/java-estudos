package br.com.bancodigital;

import br.com.bancodigital.modelo.Banco;
import br.com.bancodigital.modelo.Cliente;
import br.com.bancodigital.modelo.Conta;
import br.com.bancodigital.modelo.ContaCorrente;
import br.com.bancodigital.modelo.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
         //Instanciando o objeto banco
         Banco banco = new Banco("RFC Bank", "01786945000105", "Av T2 Setor Bueno, Goiânia - GO");
       
         //Instanciando o objeto cliente (A titulo de exemplo o cliente esta configurado para ser pessoa fisica)
         Cliente cliente = new Cliente(1, "Ricarlos", "03104089917", "Rua 15 Setor Marista, Goiânia - GO");
 
         //Aplicando polimorfismo
         Conta contaCorrente = new ContaCorrente(cliente);
         Conta contaPoupanca = new ContaPoupanca(cliente, 0.6d);
 
         System.out.println("\nDepositando na Conta Corrente 1000,00\n");
 
         //Efetuando deposito de R$ 1000 na conta corrente
         contaCorrente.depositar(1000);

         //Tirando extrato da conta corrente
         contaCorrente.extrato();

         System.out.println("\nSacando na Conta Corrente 500,00\n");
 
         //Efetuando saque de R$ 500 na conta corrente
        contaCorrente.sacar(500);

        //Tirando extrato da conta corrente
        contaCorrente.extrato();

        System.out.println("\nTransferindo da Conta Corrente para Poupanca 250,00\n");
 
         //Realizando uma transferencia de R$ 250 da conta corrente para poupança.
         contaCorrente.transferir(250, contaPoupanca);
 
         //Tirando extrato da conta corrente
         contaCorrente.extrato();
 
         
        System.out.println("\n**********************************\n");
         
         
         
         System.out.println("\nExtrato da Conta Poupanca\n");
 
         //Tirando extrato da conta poupança
         contaPoupanca.extrato();
 
         System.out.println("\nDepositando na Conta Poupanca 2000,00\n");

         //Efetuando deposito de R$ 2000 na conta poupança
         contaPoupanca.depositar(2000);

         //Tirando extrato da conta corrente
         contaPoupanca.extrato();


         System.out.println("\nRetirando da Conta Poupanca 100,00\n");
 
         //Efetuando saque de R$ 500 na conta corrente
         contaPoupanca.sacar(100);

        //Tirando extrato da conta corrente
        contaPoupanca.extrato();

 
        System.out.println("\n**********************************\n");
     
 
         //Adicionando a conta corrente ao banco
         banco.getContas().add(contaCorrente);
 
          //Adicionando a conta poupanca ao banco
         banco.getContas().add(contaPoupanca);
 
         //Exibindo a lista de contas do banco (A Exibição esta de acordo com o metod toString na classe Conta)
         
         System.out.println("\nExibindo Lista de Contas do Banco \n");
         System.out.println(banco.getContas());
    }
}