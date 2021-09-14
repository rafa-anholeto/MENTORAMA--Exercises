package entities;

import java.util.List;

public class ContaCorrente extends Conta implements Tributavel{
    private Double chequeEspecial = 1000.00;
    private Double saque;
    private Double deposito;
    private Double transferir;
    private List<Cliente> clientes;


    public ContaCorrente(){
        super();
    }

    public ContaCorrente(Integer numero, String banco, Integer agencia, Double saldo, Double chequeEspecial) {
        super();
        this.chequeEspecial = 1000.00;
    }
    public ContaCorrente(Double deposito, Double saque, Double transferir){
        this.deposito = deposito;
        this.saque = saque;
        this.transferir = transferir;
    }


    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public Double getSaldo() {
        return this.chequeEspecial + depositar() - this.saque - this.transferir;
    }

    @Override
    public Double sacar() {
        if(getSaldo() < this.saque){
            System.out.println("Erro, sem limite em sua conta, tente novamente.");
            System.exit(0);
        }
        else{
        }
        return saque;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public Double depositar() {
        return this.deposito;
    }

    @Override
    public Double transferir() {
        return transferir;
    }


    @Override
    public String toString() {
        return "Conta Corrente - BANCO ABC PAULISTA"
                +"\n "+"Saldo total da conta com limite do cheque especial: R$"+ String.format("%.2f",getChequeEspecial())
                +"\n "+"Valor depositado R$ "+ String.format("%.2f",depositar() + transferir)
                +"\n "+"Valor sacado R$ "+ String.format("%.2f,",sacar())
                +"\n "+ "Saldo restante: R$" + String.format("%.2f",getSaldo() + transferir());

    }

    @Override
    public double getValorImposto() {
        return 0;
    }
}