import java.util.Scanner;

public class Principal{

    public static void main(String[] args){

        ContaCorrente contaCorrente;
        Pessoa pessoa;
        int escolha = 0;

        pessoa = new Pessoa("Luis", 11238849, 21, 10000);
        contaCorrente = new ContaCorrente(200989, 567, "Luis", "abcd", true);
        Scanner scan = new Scanner(System.in);

        contaCorrente.setNumeroDaConta(200989);
        contaCorrente.setAgencia(567);
        contaCorrente.setDocumento("123-009");
        contaCorrente.setAtiva(true);
        contaCorrente.setSenha("****");

        do{

        System.out.println("Escolha");
        System.out.println("1 - Criar conta");
        System.out.println("2 - depositar");
        System.out.println("3 - sacar");
        System.out.println("4 - informaçao da conta");
        System.out.println("5 - sair");
        escolha = scan.nextInt();
        
       double valor;

        if(escolha == 1){
            System.out.println("Nome do Usuario: ");
            pessoa.setNome(scan.next());
            System.out.println("Cpf: ");
            pessoa.setCpf(scan.radix());
            System.out.println("Idade: ");
            pessoa.setIdade(scan.nextInt());
            System.out.println("Saldo: ");
            pessoa.setSalario(scan.nextInt());


        }else if(escolha == 2){
            System.out.println("Valor do Deposito: ");
            valor = scan.nextInt();
            contaCorrente.depositar(valor);
            System.out.println("Saldo após deposito R$: "+pessoa.getSalario());
        
        }else if(escolha == 3){
            System.out.println("Valor do Saque: ");
            valor = scan.nextInt();

            contaCorrente.saque(valor);
            System.out.println("Saldo após o saque R$: "+pessoa.getSalario());

        }else if(escolha == 4){
            
            System.out.println("Nome do Usuario: " +pessoa.getNome());
            System.out.println("CPF: " +pessoa.getCpf());
            System.out.println("Numero da conta: " +contaCorrente.getNumeroDaConta());
            System.out.println("Agencia: " +contaCorrente.getAgencia());
            System.out.println("Saldo " +pessoa.getSalario());

        }

      
    }while(escolha != 5);
        
}

}