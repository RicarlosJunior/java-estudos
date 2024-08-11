import modelo.Banco;
import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;


public class App {
    public static void main(String[] args) throws Exception {

        //Instanciando o banco
        Banco banco = new Banco("RFC Bank", "01786945000105", "Av T2 Setor Bueno, Goiânia - GO");
       
        //Instanciando o cliente (A titulo de exemplo o cliente esta configurado para ser pessoa fisica)
        Cliente cliente = new Cliente(1, "Ricarlos", "03104089917", "Rua 15 Setor Marista, Goiânia - GO");

        //Aplicando polimorfismo
        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente, 0.6d);


        //Efetuando deposito de R$ 1000 na conta corrente
        contaCorrente.depositar(1000);

        //Efetuando saque de R$ 500 na conta corrente
        contaCorrente.sacar(500);

        //Realizando uma transferencia de R$ 250 da conta corrente para poupança.
        contaCorrente.transferir(250, contaPoupanca);

        //Tirando extrato da conta corrente
        contaCorrente.extrato();



        System.out.println("\n**********************************\n");



         //Tirando extrato da conta poupança
         contaPoupanca.extrato();


         System.out.println("\n**********************************\n");
    

        //Adicionando a conta corrente ao banco
        banco.getContas().add(contaCorrente);

         //Adicionando a conta poupanca ao banco
        banco.getContas().add(contaPoupanca);

        //Exibindo a lista de contas do banco (A Exibição esta de acordo com o metod toString na classe Conta)
        System.out.println(banco.getContas());

    }
}
