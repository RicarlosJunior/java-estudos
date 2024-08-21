import java.util.Scanner;

import model.ContaTermial;

public class App {
    public static void main(String[] args) throws Exception {
        
        ContaTermial contaTermial = new ContaTermial();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe seu Nome: ");
        contaTermial.setNomeCliente(scanner.nextLine());

        System.out.print("Por favor, informe a Agência: ");
        contaTermial.setAgencia(scanner.nextLine());

        System.out.print("Por favor, informe o Numero da Conta: ");
        contaTermial.setNumero(scanner.nextInt());

        System.out.print("Por favor, informe o Saldo: ");
        contaTermial.setSaldo(scanner.nextDouble());
        
        scanner.close();

        System.out.print(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua Agência é %s, sua Conta %d e seu saldo %.2f já está disponivel.", 
                            contaTermial.getNomeCliente(), 
                            contaTermial.getAgencia(), 
                            contaTermial.getNumero(), 
                            contaTermial.getSaldo()));
    }
}
