package application;

import entities.*;

import java.util.*;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);


        int option = 0;
        do{
            System.out.println("*** BANCO ABC PAULISTA ***");
            System.out.println("Menu de opções: ");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Criar cliente");
            System.out.println("5 - Transferir valores");
            System.out.println("6 - Mostrar montante disponível nas contas");
            System.out.println("7 - SAIR");
            System.out.println("Escolha a opção desejada:");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            process(option);

        } while(option != 7);

    }
    public static void process(int option){
        Scanner sc = new Scanner(System.in);
        List<Cliente> cliente = new ArrayList<>();
        List<String> contas = new ArrayList<>();
        Conta conta = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        Conta sl = new ContaSalario();
        Random aleatorio = new Random();
        switch (option){
            case 1:{
                System.out.println("Deseja criar qual conta? ");
                System.out.println("1 - Criar conta corrente. ");
                System.out.println("2 - Criar conta poupança. ");
                System.out.println("3 - Criar conta salário. ");
                int opcao = sc.nextInt();
                int cont = 0;
                if(opcao == 1){
                    System.out.println("Conta corrente criada.");
                    System.out.println("Limite de cheque especial padrão: R$ 1000,00");
                    String contaCorrente = "Conta corrente: Banco ABC, número:"+ aleatorio.nextInt(1000)+ " Agência: " + aleatorio.nextInt(300);
                    contas.add(contaCorrente);
                    System.out.println("Pressione 1 para voltar ao menu,3 para criar uma conta poupança ou 4 para conta salário.");
                    cont = sc.nextInt();
                    if(cont == 3){
                        System.out.println("Conta poupança criada com sucesso. Bem vindo cliente, espero que goste de nossos serviços.");
                        String contaPoupanca = "Conta poupança: Banco ABC, número:"+ aleatorio.nextInt(1000)+ " Agência: " + aleatorio.nextInt(300);
                        contas.add(contaPoupanca);
                        System.out.println("Pressione 1 para voltar ao menu ou 4 para criar conta salário");
                        cont = sc.nextInt();
                    }
                    if(cont == 4){
                        System.out.println("Conta salário criada com sucesso.");
                        String contaSalario = "Conta salário: Banco ABC, número:"+ aleatorio.nextInt(1000)+ " Agência: " + aleatorio.nextInt(300);
                        contas.add(contaSalario);

                    }
                }
                else if(opcao == 2){
                    System.out.println("Conta poupança criada com sucesso. Bem vindo cliente, espero que goste de nossos serviços");
                    String contaPoupanca = "Conta poupança: Banco ABC, número:"+ aleatorio.nextInt(1000)+ " Agência: " + aleatorio.nextInt(300);
                    contas.add(contaPoupanca);
                    System.out.println("Pressione 1 para voltar ao menu ou 4 para criar conta salário.");
                    cont = sc.nextInt();
                    if(cont == 4){
                        System.out.println("Conta salário criada com sucesso.");
                        String contaSalario = "Conta salário: Banco ABC, número:"+ aleatorio.nextInt(1000)+ " Agência: " + aleatorio.nextInt(300);
                        contas.add(contaSalario);
                        System.out.println("Pressione 1 para voltar ao menu.");
                        cont = sc.nextInt();
                    }
                }
                else if(opcao == 3) {
                    System.out.println("Conta salário criada com sucesso.");
                    System.out.println("Limites de saque: 2");
                    String contaSalario = "Conta salário: Banco ABC, número:" + aleatorio.nextInt(1000) + " Agência: " + aleatorio.nextInt(300);
                    contas.add(contaSalario);
                    System.out.println("Pressione 1 para voltar ao menu.");
                    cont = sc.nextInt();

                }
                System.out.println("Contas criadas: BANCO ABC PAULISTA");
                System.out.println("-----------------------------------------");
                for (String contasTotal : contas) {
                    System.out.println(contasTotal);
                }
                System.out.println("Pressione 1 para voltar ao menu.");
                cont = sc.nextInt();

                break;
            }

            case 2:{
                System.out.println("Deseja realizar o saque de qual tipo de conta? ");
                System.out.println(" 1 - CONTA CORRENTE");
                System.out.println(" 2 - CONTA POUPANÇA");
                System.out.println(" 3 - CONTA SALÁRIO");
                int opcao = sc.nextInt();

                if(opcao == 1){
                    System.out.print("Qual valor deseja sacar da conta corrente? R$ ");
                    double saque = sc.nextDouble();
                    conta = new ContaCorrente(0.0, saque,0.0);
                    System.out.println(conta.toString());
                    System.out.println("Pressione 1 para voltar ao menu.");
                    sc.nextInt();

                }
                else if(opcao == 2){
                    System.out.print("Qual valor deseja sacar da conta poupança? R$ ");
                    double saque = sc.nextDouble();
                    cp = new ContaPoupanca(0.0,saque,0.0);
                    System.out.println(cp.toString());
                    System.out.println("Pressione 1 para voltar ao menu.");
                    sc.nextInt();
                }
                else{
                    System.out.print("Qual valor deseja sacar da conta salário? R$ ");
                    double saque = sc.nextDouble();
                    sl = new ContaSalario(0.0,saque,0.0);
                    System.out.println(sl.toString());
                    System.out.println("Pressione 1 para voltar ao menu.");
                    sc.nextInt();

                }
                break;
            }

            case 3:{
                System.out.println("Deseja depositar em qual conta? ");
                System.out.println("1 - CONTA CORRENTE");
                System.out.println("2 - CONTA POUPANÇA.");
                System.out.println("3 - CONTA SALÁRIO.");
                int opcao = sc.nextInt();
                if(opcao == 1){
                    sc = new Scanner(System.in);
                    System.out.print("Quanto você deseja depositar? R$ ");
                    double deposito = sc.nextDouble();
                    conta = new ContaCorrente(deposito, 0.0,0.0);
                    System.out.println(conta.toString());
                    System.out.println("Pressione 1 para voltar ao menu.");
                    sc.nextInt();
                }
                else if (opcao == 2){
                    System.out.print("Quanto você deseja depositar? R$ ");
                    double deposito = sc.nextDouble();
                    cp = new ContaPoupanca(deposito, 0.0,0.0);
                    System.out.println(cp.toString());
                    System.out.println("Pressione 1 para voltar ao menu.");
                    sc.nextInt();

                }
                else{
                    System.out.print("Quanto você deseja depositar? R$ ");
                    double deposito = sc.nextDouble();
                    sl = new ContaSalario(deposito, 0.0,0.0);
                    System.out.println(sl.toString());
                    System.out.println("Pressione 1 para voltar ao menu.");
                    sc.nextInt();

                }
                break;

            }
            case 4:{
                System.out.println("1 - Conta pessoa física.");
                System.out.println("2 - Conta pessoa jurídica");
                int opcao = sc.nextInt();
                int cont = 0;
                if(opcao == 1){
                    System.out.print("Certo, digite seu nome: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Digite seu CPF: ");
                    String cpf = sc.next();
                    Cliente cl = new Cliente(name, cpf, "--");
                    cliente.add(cl);
                    System.out.println("Conta criada com sucesso.");
                    System.out.println("Pressione 1 para voltar ao menu ou 3 para criar uma conta jurídica.");
                    cont = sc.nextInt();

                    if(cont == 3){
                        System.out.println("Digite o nome de sua empresa: ");
                        sc.nextLine();
                        name = sc.nextLine();
                        System.out.println("Digite seu CNPJ: ");
                        String cnpj = sc.next();
                        cl = new Cliente(name, "--", cnpj);
                        cliente.add(cl);
                    }

                }
                else{
                    System.out.println("Digite o nome de sua empresa: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Digite seu CNPJ: ");
                    String cnpj = sc.next();
                    Cliente cl = new Cliente(name, "--", cnpj);
                    cliente.add(cl);
                    System.out.println("Conta finalizada. ");
                    System.out.println("Pressione 1 para voltar ao menu.");
                    cont = sc.nextInt();

                }
                for(Cliente cli: cliente){
                    System.out.println(cli);
                }
                System.out.println();
                System.out.println("Pressione 1 para voltar ao menu.");
                sc.nextInt();
                break;
            }
            case 5:{
                System.out.println("Você deseja transferir valores de qual conta? ");
                System.out.println("1 - Conta corrente para conta poupança.");
                System.out.println("2 - Conta poupança para conta corrente.");
                System.out.println("3 - Conta Corrente para conta salário.");
                int opcao = sc.nextInt();
                if(opcao == 1){
                    System.out.println("Qual valor? ");
                    double valor = sc.nextDouble();
                    conta = new ContaCorrente(0.0,valor,0.0);
                    cp = new ContaPoupanca(valor,0.0, 0.0);
                    System.out.println(conta.toString());
                    System.out.println();
                    System.out.println(cp.toString());
                }
                else if(opcao == 2){
                    System.out.println("Qual valor? ");
                    double valor = sc.nextDouble();
                    cp = new ContaPoupanca(0.0,valor,0.0);
                    conta = new ContaCorrente(valor,0.0, 0.0);

                    System.out.println(cp.toString());
                    System.out.println();
                    System.out.println(conta.toString());
                }
                else{
                    System.out.println("Qual valor? ");
                    double valor = sc.nextDouble();
                    conta = new ContaCorrente(0.0,valor,0.0);
                    sl = new ContaSalario(valor,0.0, 0.0);
                    System.out.println(conta.toString());
                    System.out.println();
                    System.out.println(sl.toString());
                }
                break;

            }
            case 6:{
                conta = new ContaCorrente(0.0,0.0,0.0);
                cp = new ContaPoupanca(0.0,0.0,0.0);
                sl = new ContaSalario(0.0,0.0,0.0);
                System.out.println("Montante disponível nas contas: R$ "+ String.format("%.2f",conta.getSaldo() + cp.getSaldo()+ sl.getSaldo()));
            }
            break;

            case 7:{
                System.out.println("Obrigado pela preferência. ");
            }
        }



    }
}
