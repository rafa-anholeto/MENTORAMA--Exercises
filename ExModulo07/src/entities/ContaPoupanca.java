package entities;

public class ContaPoupanca extends Conta{
    private Integer diaAniversario;
    private Double taxaDeJuros;
    private Double saque;

    public ContaPoupanca(Integer numero, String banco, Integer agencia, Double saldo, Integer diaAniversario, Double taxaDeJuros, Double saque) {
        super(numero, banco, agencia, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
        this.saque = saque;
    }

    @Override
    public Double getSaldo() {
        if(diaAniversario == 20){
            return this.saldo + (this.taxaDeJuros*5) * this.saldo;
        }
        return this.saldo + (this.taxaDeJuros*5) * this.saldo - this.saque;
    }

    @Override
    public Double sacar() {
        if(getSaldo() < this.saque){
            System.out.println("Erro, você não possui esse valor na conta, volte novamente ao menu.");
            System.exit(0);
        }
        else{
            return this.saldo + (this.taxaDeJuros*5) * this.saldo - this.saque;
        }
        return this.saque;
    }

    @Override
    public Double getDepositar() {
        return null;
    }

    @Override
    public String toString() {
        return "Conta Poupanca - BANCO ABC PAULISTA"
                +"\n "+"Saldo total da conta sem acréscimo de juros: R$ " + String.format("%.2f",(this.saldo + this.taxaDeJuros * this.saldo))
                +"\n "+"Aniversario da conta: Dia " + diaAniversario
                +"\n "+"Taxa de juros comum: "+ taxaDeJuros
                +"\n "+"Taxa de juros no dia do aniversário: "+ this.taxaDeJuros*5
                +"\n "+"Saldo da conta no aniversário(hoje): R$ " + String.format("%.2f", getSaldo())
                +"\n "+"Valor sacado: R$ " + String.format("%.2f", this.saque)
                +"\n "+"Saldo da conta depois do saque R$"+ String.format("%.2f",sacar());

    }

}
