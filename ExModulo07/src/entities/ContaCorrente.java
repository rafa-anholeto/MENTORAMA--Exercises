package entities;

public class ContaCorrente extends Conta {
    private Double chequeEspecial;
    private Double saque;

    public ContaCorrente(Integer numero, String banco, Integer agencia, Double saldo, Double chequeEspecial, Double saque) {
        super(numero, banco, agencia, saldo);
        this.chequeEspecial = chequeEspecial;
        this.saque = saque;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public Double getSaldo() {
        return this.chequeEspecial + this.saldo;
    }

    @Override
    public Double getSacar() {
        if(getSaldo() < saque){
            System.out.println("Erro, sem limite, tente novamente.");
            System.exit(0);
        }
        else{
        }
        return this.saque;
    }

    @Override
    public Double getDepositar() {
        return null;
    }

    @Override
    public String toString() {
        return "Conta Corrente - BANCO ABC PAULISTA"
                +"\n "+"Saldo total da conta: R$"+ String.format("%.2f",getSaldo())
                +"\n "+"Valor sacado R$ "+ String.format("%.2f",getSacar()) +" e seu novo saldo é de R$ "+ String.format("%.2f",getSaldo()- saque)
                +"\n "+ "Saldo restante: " + String.format("%.2f",getSaldo()- saque)
                +"\n "+ "Cheque Especial da conta: "+ String.format("%.2f",chequeEspecial);

    }
}
