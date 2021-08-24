package entities;

import java.util.List;

public class ContaPoupanca extends Conta implements Tributavel{
    private Integer diaAniversario = 20;
    private Double taxaDeJuros = 0.05;
    private Double saque;
    private Double deposito;
    private Double transferir;
    private List<Cliente> clientes;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(Integer numero, String banco, Integer agencia, Double saldo, Integer diaAniversario, Double taxaDeJuros, Double saque) {
        super(numero, banco, agencia, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = 0.05;
        this.saque = saque;
    }
    public ContaPoupanca(Double deposito, Double saque, Double transferir){
        this.deposito = deposito;
        this.saque = saque;
        this.transferir = transferir;
    }


    @Override
    public Double getSaldo() {
        this.saldo = 10.5;
        return this.saldo + (saldo * this.taxaDeJuros*5);
    }

    @Override
    public Double sacar() {
        if(getSaldo() < this.saque){
            System.out.println("Erro, você não possui esse valor na conta, volte novamente ao menu.");
            System.exit(0);
        }
        else{
        }
        return getSaldo() - this.saque;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public Double depositar() {
        return deposito;
    }

    @Override
    public Double transferir() {
        if(transferir > getSaldo()){
            System.out.println("Erro, sem dinheiro");
            System.exit(0);
        }
        return transferir;
    }


    @Override
    public String toString() {
        return "Conta Poupanca - BANCO ABC PAULISTA"
                +"\n "+"Saldo total da conta sem acréscimo de juros: R$ " + String.format("%.2f",(getSaldo() - saldo * this.taxaDeJuros*5) + depositar())
                +"\n "+"Saldo da conta no aniversário(hoje): R$ " + String.format("%.2f",getSaldo() + depositar())
                +"\n "+"Valor depositado: R$ " + String.format("%.2f",deposito)
                +"\n "+"Aniversario da conta: Dia " + diaAniversario
                +"\n "+"Taxa de juros comum: "+ taxaDeJuros
                +"\n "+"Taxa de juros no dia do aniversário: "+ this.taxaDeJuros*5
                +"\n "+"Valor sacado: R$ " + String.format("%.2f", this.saque)
                +"\n "+"Saldo da conta depois do saque R$ "+ String.format("%.2f",sacar() + depositar());
    }


    @Override
    public double getValorImposto() {
        return 0;
    }
}